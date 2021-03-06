//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.18 at 04:18:21 PM CEST 
//


package udir.types.clientidentification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Skoleorgno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Skolenavn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Brukernavn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Nonce" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "ClientIdentification", namespace = "http://pas.udir.no/ClientIdentification")
public class ClientIdentification {

    @XmlElement(name = "Skoleorgno", namespace = "", required = true)
    protected String skoleorgno;
    @XmlElement(name = "Skolenavn", namespace = "", required = true)
    protected String skolenavn;
    @XmlElement(name = "Brukernavn", namespace = "", required = true)
    protected String brukernavn;
    @XmlElement(name = "Nonce", namespace = "", required = true)
    protected String nonce;
    @XmlElement(name = "TimeStamp", namespace = "", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlElement(name = "Signature", required = true)
    protected SignatureType signature;

    /**
     * Gets the value of the skoleorgno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkoleorgno() {
        return skoleorgno;
    }

    /**
     * Sets the value of the skoleorgno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkoleorgno(String value) {
        this.skoleorgno = value;
    }

    /**
     * Gets the value of the skolenavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkolenavn() {
        return skolenavn;
    }

    /**
     * Sets the value of the skolenavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkolenavn(String value) {
        this.skolenavn = value;
    }

    /**
     * Gets the value of the brukernavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrukernavn() {
        return brukernavn;
    }

    /**
     * Sets the value of the brukernavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrukernavn(String value) {
        this.brukernavn = value;
    }

    /**
     * Gets the value of the nonce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonce() {
        return nonce;
    }

    /**
     * Sets the value of the nonce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonce(String value) {
        this.nonce = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

}
