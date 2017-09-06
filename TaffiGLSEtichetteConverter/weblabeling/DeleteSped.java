/**
 * DeleteSped.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gls_italy.weblabeling;

public class DeleteSped  implements java.io.Serializable {
    private java.lang.String sedeGls;

    private java.lang.String codiceClienteGls;

    private java.lang.String passwordClienteGls;

    private java.lang.String numSpedizione;

    public DeleteSped() {
    }

    public DeleteSped(
           java.lang.String sedeGls,
           java.lang.String codiceClienteGls,
           java.lang.String passwordClienteGls,
           java.lang.String numSpedizione) {
           this.sedeGls = sedeGls;
           this.codiceClienteGls = codiceClienteGls;
           this.passwordClienteGls = passwordClienteGls;
           this.numSpedizione = numSpedizione;
    }


    /**
     * Gets the sedeGls value for this DeleteSped.
     * 
     * @return sedeGls
     */
    public java.lang.String getSedeGls() {
        return sedeGls;
    }


    /**
     * Sets the sedeGls value for this DeleteSped.
     * 
     * @param sedeGls
     */
    public void setSedeGls(java.lang.String sedeGls) {
        this.sedeGls = sedeGls;
    }


    /**
     * Gets the codiceClienteGls value for this DeleteSped.
     * 
     * @return codiceClienteGls
     */
    public java.lang.String getCodiceClienteGls() {
        return codiceClienteGls;
    }


    /**
     * Sets the codiceClienteGls value for this DeleteSped.
     * 
     * @param codiceClienteGls
     */
    public void setCodiceClienteGls(java.lang.String codiceClienteGls) {
        this.codiceClienteGls = codiceClienteGls;
    }


    /**
     * Gets the passwordClienteGls value for this DeleteSped.
     * 
     * @return passwordClienteGls
     */
    public java.lang.String getPasswordClienteGls() {
        return passwordClienteGls;
    }


    /**
     * Sets the passwordClienteGls value for this DeleteSped.
     * 
     * @param passwordClienteGls
     */
    public void setPasswordClienteGls(java.lang.String passwordClienteGls) {
        this.passwordClienteGls = passwordClienteGls;
    }


    /**
     * Gets the numSpedizione value for this DeleteSped.
     * 
     * @return numSpedizione
     */
    public java.lang.String getNumSpedizione() {
        return numSpedizione;
    }


    /**
     * Sets the numSpedizione value for this DeleteSped.
     * 
     * @param numSpedizione
     */
    public void setNumSpedizione(java.lang.String numSpedizione) {
        this.numSpedizione = numSpedizione;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteSped)) return false;
        DeleteSped other = (DeleteSped) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sedeGls==null && other.getSedeGls()==null) || 
             (this.sedeGls!=null &&
              this.sedeGls.equals(other.getSedeGls()))) &&
            ((this.codiceClienteGls==null && other.getCodiceClienteGls()==null) || 
             (this.codiceClienteGls!=null &&
              this.codiceClienteGls.equals(other.getCodiceClienteGls()))) &&
            ((this.passwordClienteGls==null && other.getPasswordClienteGls()==null) || 
             (this.passwordClienteGls!=null &&
              this.passwordClienteGls.equals(other.getPasswordClienteGls()))) &&
            ((this.numSpedizione==null && other.getNumSpedizione()==null) || 
             (this.numSpedizione!=null &&
              this.numSpedizione.equals(other.getNumSpedizione())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSedeGls() != null) {
            _hashCode += getSedeGls().hashCode();
        }
        if (getCodiceClienteGls() != null) {
            _hashCode += getCodiceClienteGls().hashCode();
        }
        if (getPasswordClienteGls() != null) {
            _hashCode += getPasswordClienteGls().hashCode();
        }
        if (getNumSpedizione() != null) {
            _hashCode += getNumSpedizione().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteSped.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://weblabeling.gls-italy.com/", ">DeleteSped"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sedeGls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://weblabeling.gls-italy.com/", "SedeGls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceClienteGls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://weblabeling.gls-italy.com/", "CodiceClienteGls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordClienteGls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://weblabeling.gls-italy.com/", "PasswordClienteGls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numSpedizione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://weblabeling.gls-italy.com/", "NumSpedizione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
