
package com.bronto.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for recentActivitySearchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recentActivitySearchRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="readDirection" type="{http://api.bronto.com/v4}readDirection" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recentActivitySearchRequest", propOrder = {
    "start",
    "size",
    "readDirection"
})
@XmlSeeAlso({
    RecentInboundActivitySearchRequest.class,
    RecentOutboundActivitySearchRequest.class
})
public abstract class RecentActivitySearchRequest {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar start;
    protected int size;
    protected ReadDirection readDirection;

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStart(XMLGregorianCalendar value) {
        this.start = value;
    }

    /**
     * Gets the value of the size property.
     * 
     */
    public int getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     */
    public void setSize(int value) {
        this.size = value;
    }

    /**
     * Gets the value of the readDirection property.
     * 
     * @return
     *     possible object is
     *     {@link ReadDirection }
     *     
     */
    public ReadDirection getReadDirection() {
        return readDirection;
    }

    /**
     * Sets the value of the readDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadDirection }
     *     
     */
    public void setReadDirection(ReadDirection value) {
        this.readDirection = value;
    }

}
