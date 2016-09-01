
package co.edu.eam.ingesoft.pa2.clientedatacredito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultasCiudadanoEntidad complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultasCiudadanoEntidad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipodoc" type="{http://co.gov.centralriesgo.consulta}tipoDocEnum" minOccurs="0"/>
 *         &lt;element name="numerodoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultasCiudadanoEntidad", propOrder = {
    "entidad",
    "tipodoc",
    "numerodoc"
})
public class ConsultasCiudadanoEntidad {

    protected String entidad;
    @XmlSchemaType(name = "string")
    protected TipoDocEnum tipodoc;
    protected String numerodoc;

    /**
     * Obtiene el valor de la propiedad entidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntidad() {
        return entidad;
    }

    /**
     * Define el valor de la propiedad entidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntidad(String value) {
        this.entidad = value;
    }

    /**
     * Obtiene el valor de la propiedad tipodoc.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocEnum }
     *     
     */
    public TipoDocEnum getTipodoc() {
        return tipodoc;
    }

    /**
     * Define el valor de la propiedad tipodoc.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocEnum }
     *     
     */
    public void setTipodoc(TipoDocEnum value) {
        this.tipodoc = value;
    }

    /**
     * Obtiene el valor de la propiedad numerodoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerodoc() {
        return numerodoc;
    }

    /**
     * Define el valor de la propiedad numerodoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerodoc(String value) {
        this.numerodoc = value;
    }

}
