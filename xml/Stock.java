
package com.origamisoftware.teach.advanced.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}symbol"/>
 *         &lt;element ref="{}price"/>
 *         &lt;element ref="{}time"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "symbol",
        "price",
        "time"
})
@XmlRootElement(name = "stock")
public class Stock implements XMLDomainObject {

    @XmlElement(required = true)
    protected Symbol symbol;
    @XmlElement(required = true)
    protected Price price;
    @XmlElement(required = true)
    protected Time time;

    /**
     * Gets the value of the symbol property.
     *
     * @return
     *     possible object is
     *     {@link Symbol }
     *
     */
    public Symbol getSymbol() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     *
     * @param value
     *     allowed object is
     *     {@link Symbol }
     *
     */
    public void setSymbol(Symbol value) {
        this.symbol = value;
    }

    /**
     * Gets the value of the price property.
     *
     * @return
     *     possible object is
     *     {@link Price }
     *
     */
    public Price getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     *
     * @param value
     *     allowed object is
     *     {@link Price }
     *
     */
    public void setPrice(Price value) {
        this.price = value;
    }

    /**
     * Gets the value of the time property.
     *
     * @return
     *     possible object is
     *     {@link Time }
     *
     */
    public Time getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     *
     * @param value
     *     allowed object is
     *     {@link Time }
     *
     */
    public void setTime(Time value) {
        this.time = value;
    }


    @Override
    public String toString() {
        return "stock{" +
                "symbol=" + symbol +
                ", price=" + price +
                ", time=" + time +
                '}';
    }
}
