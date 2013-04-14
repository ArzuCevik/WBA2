//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.13 at 09:42:49 PM MESZ 
//
package Aufgabe4;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="rezept">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="titel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="zutaten">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="menge" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="einheit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="zutat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="portionen" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="zubereitung">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="arbeitszeit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="beschreibung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="bild" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="r_id" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "rezept"
})
@XmlRootElement(name = "rezeptsammlung")
public class Rezeptsammlung {

    @XmlElement(required = true)
    protected static List<Rezeptsammlung.Rezept> Rezept;

    /**
     * Gets the value of the rezept property.
     * 
     * @return
     *     possible object is
     *     {@link Rezeptsammlung.Rezept }
     *     
     */
 

    public List<Rezeptsammlung.Rezept> getRezept() {
  	if (Rezept == null) {
			Rezept = new ArrayList<Rezeptsammlung.Rezept>();
		}
		return this.Rezept;
	}

  /*
     public Rezeptsammlung.Rezept getRezept() {
     
        return this.Rezept;
    }
  */
    

    /*public Rezept getRezept() {
        if (rezept== null) {
          rezept = new ArrayList<Rezeptsammlung.Rezept>();
        }
        return  this.rezept;
    }*/
/*    
    public static Rezept getRezept(int i) {
    //    if	(i == Rezeptsammlung.getRezept().getRId());
		return rezept;
    }
*/
    /**
     * Sets the value of the rezept property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rezeptsammlung.Rezept }
     *     
     */
    /*
    public void setRezept(Rezeptsammlung.Rezept value) {
        this.Rezept = value;
    }
    */


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
     *         &lt;element name="titel" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="zutaten">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="menge" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                   &lt;element name="einheit" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="zutat" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="portionen" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="zubereitung">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="arbeitszeit" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="beschreibung" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="bild" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *       &lt;attribute name="r_id" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "titel",
        "zutaten",
        "zubereitung",
        "bild"
    })
    public static class Rezept {

        public class Bild {
        	

	}


		@XmlElement(required = true)
        protected static String titel;
        @XmlElement(required = true)
        protected Rezeptsammlung.Rezept.Zutaten zutaten;
        @XmlElement(required = true)
        protected Rezeptsammlung.Rezept.Zubereitung zubereitung;
        @XmlElement(required = true)
        protected List<Rezeptsammlung.Rezept.Bild> bild;
        @XmlAttribute(name = "r_id")
        protected Integer rId;

        /**
         * Gets the value of the titel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public static String getTitel() {
            return titel;
        }

        /**
         * Sets the value of the titel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitel(String value) {
            this.titel = value;
        }

        /**
         * Gets the value of the zutaten property.
         * 
         * @return
         *     possible object is
         *     {@link Rezeptsammlung.Rezept.Zutaten }
         *     
         */
        public Rezeptsammlung.Rezept.Zutaten getZutaten() {
            return zutaten;
        }

        /**
         * Sets the value of the zutaten property.
         * 
         * @param value
         *     allowed object is
         *     {@link Rezeptsammlung.Rezept.Zutaten }
         *     
         */
        public void setZutaten(Rezeptsammlung.Rezept.Zutaten value) {
            this.zutaten = value;
        }

        /**
         * Gets the value of the zubereitung property.
         * 
         * @return
         *     possible object is
         *     {@link Rezeptsammlung.Rezept.Zubereitung }
         *     
         */
        public Rezeptsammlung.Rezept.Zubereitung getZubereitung() {
            return zubereitung;
        }

        /**
         * Sets the value of the zubereitung property.
         * 
         * @param value
         *     allowed object is
         *     {@link Rezeptsammlung.Rezept.Zubereitung }
         *     
         */
        public void setZubereitung(Rezeptsammlung.Rezept.Zubereitung value) {
            this.zubereitung = value;
        }

        /**
         * Gets the value of the bild property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        /*
        public String getBild() {
            return bild;
        }
        */
        public List<Rezeptsammlung.Rezept.Bild> getBild() {
            if (bild == null) {
                bild = new ArrayList<Rezeptsammlung.Rezept.Bild>();
            }
            return this.bild;
        }

        /**
         * Sets the value of the bild property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBild(List<Bild> value) {
            this.bild = value;
        }

        /**
         * Gets the value of the rId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Integer getRId() {
            return rId;
        }

        /**
         * Sets the value of the rId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRId(Integer value) {
            this.rId = value;
        }


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
         *         &lt;element name="arbeitszeit" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="beschreibung" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "arbeitszeit",
            "level",
            "beschreibung"
        })
        public static class Zubereitung {

            @XmlElement(required = true)
            protected String arbeitszeit;
            @XmlElement(required = true)
            protected String level;
            @XmlElement(required = true)
            protected String beschreibung;

            /**
             * Gets the value of the arbeitszeit property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArbeitszeit() {
                return arbeitszeit;
            }

            /**
             * Sets the value of the arbeitszeit property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArbeitszeit(String value) {
                this.arbeitszeit = value;
            }

            /**
             * Gets the value of the level property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLevel() {
                return level;
            }

            /**
             * Sets the value of the level property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLevel(String value) {
                this.level = value;
            }

            /**
             * Gets the value of the beschreibung property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBeschreibung() {
                return beschreibung;
            }

            /**
             * Sets the value of the beschreibung property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBeschreibung(String value) {
                this.beschreibung = value;
            }

        }


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
         *         &lt;element name="menge" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="einheit" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="zutat" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *       &lt;attribute name="portionen" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "menge",
            "einheit",
            "zutat"
        })
        public static class Zutaten {

            @XmlElement(required = true)
            protected Float menge;
            @XmlElement(required = true)
            protected String einheit;
            @XmlElement(required = true)
            protected String zutat;
            @XmlAttribute
            protected Integer portionen;

            /**
             * Gets the value of the menge property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public Float getMenge() {
                return menge;
            }

            /**
             * Sets the value of the menge property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMenge(Float value) {
                this.menge = value;
            }

            /**
             * Gets the value of the einheit property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEinheit() {
                return einheit;
            }

            /**
             * Sets the value of the einheit property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEinheit(String value) {
                this.einheit = value;
            }

            /**
             * Gets the value of the zutat property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZutat() {
                return zutat;
            }

            /**
             * Sets the value of the zutat property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZutat(String value) {
                this.zutat = value;
            }

            /**
             * Gets the value of the portionen property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public Integer getPortionen() {
                return portionen;
            }

            /**
             * Sets the value of the portionen property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPortionen(Integer value) {
                this.portionen = value;
            }

        }

        /*
        public static Rezept getbyID(int i) {
			if (i == this.getRId()) return rezept;
			else System.out.println("Kein Rezept zur angegeben ID gefunden!");
		}
		*/


    }

}
