//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.17 at 11:22:23 AM CEST 
//


package org.cool.multi.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tocitem"
})
@XmlRootElement(name = "tocitem")
public class Tocitem {

    @XmlAttribute(name = "xml:lang")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String xmlLang;
    @XmlAttribute(name = "text", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String text;
    @XmlAttribute(name = "image")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String image;
    @XmlAttribute(name = "target")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String target;
    @XmlAttribute(name = "mergetype")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String mergetype;
    @XmlAttribute(name = "expand")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String expand;
    @XmlAttribute(name = "presentationtype")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String presentationtype;
    @XmlAttribute(name = "presentationname")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String presentationname;
    protected List<Tocitem> tocitem;

    /**
     * Gets the value of the xmlLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlLang() {
        return xmlLang;
    }

    /**
     * Sets the value of the xmlLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlLang(String value) {
        this.xmlLang = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImage(String value) {
        this.image = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Gets the value of the mergetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMergetype() {
        return mergetype;
    }

    /**
     * Sets the value of the mergetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMergetype(String value) {
        this.mergetype = value;
    }

    /**
     * Gets the value of the expand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpand() {
        return expand;
    }

    /**
     * Sets the value of the expand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpand(String value) {
        this.expand = value;
    }

    /**
     * Gets the value of the presentationtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentationtype() {
        return presentationtype;
    }

    /**
     * Sets the value of the presentationtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentationtype(String value) {
        this.presentationtype = value;
    }

    /**
     * Gets the value of the presentationname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentationname() {
        return presentationname;
    }

    /**
     * Sets the value of the presentationname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentationname(String value) {
        this.presentationname = value;
    }

    /**
     * Gets the value of the tocitem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tocitem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTocitem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tocitem }
     * 
     * 
     */
    public List<Tocitem> getTocitem() {
        if (tocitem == null) {
            tocitem = new ArrayList<Tocitem>();
        }
        return this.tocitem;
    }

}