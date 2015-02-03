﻿using System.IO;
using System.Reflection;
using System.Security.Cryptography.X509Certificates;
using System.Security.Cryptography.Xml;
using System.Xml;

namespace UDIR.PAS2.Example.Client.Extensions
{
    internal static class XmlDocumentExtension
    {
        public static void Sign(this XmlDocument xmlDocument)
        {
            using (var stream = Assembly.GetExecutingAssembly()
                .GetManifestResourceStream("Example.External.Client.Console.Certificates.Testcert.pfx"))
            {
                if (stream == null) return;

                var bytes = new byte[stream.Length];
                stream.Read(bytes, 0, bytes.Length);
                var signingCert = new X509Certificate2(bytes);
                var signedXml = new SignedXml(xmlDocument);
                var keyInfo = new KeyInfo();
                keyInfo.AddClause(new KeyInfoX509Data(signingCert));
                signedXml.KeyInfo = keyInfo;
                signedXml.SigningKey = signingCert.PrivateKey;
                var reference = new Reference {Uri = string.Empty};
                reference.AddTransform(new XmlDsigEnvelopedSignatureTransform());
                signedXml.AddReference(reference);
                signedXml.ComputeSignature();
                xmlDocument.DocumentElement.IfNotNull(
                    elem => elem.AppendChild(xmlDocument.ImportNode(signedXml.GetXml(), true)));
            }
        }

        public static string ConvertToString(this XmlDocument payload)
        {
            using (var stringWriter = new StringWriter())
            using (var xmlTextWriter = XmlWriter.Create(stringWriter))
            {
                payload.WriteTo(xmlTextWriter);
                xmlTextWriter.Flush();
                return stringWriter.GetStringBuilder().ToString();
            }
        }
    }
}
