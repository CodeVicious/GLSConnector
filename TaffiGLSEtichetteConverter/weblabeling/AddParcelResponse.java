/**
 * AddParcelResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gls_italy.weblabeling;

public class AddParcelResponse  implements java.io.Serializable {
    private com.gls_italy.weblabeling.AddParcelResponseAddParcelResult addParcelResult;

    public AddParcelResponse() {
    }

    public AddParcelResponse(
           com.gls_italy.weblabeling.AddParcelResponseAddParcelResult addParcelResult) {
           this.addParcelResult = addParcelResult;
    }


    /**
     * Gets the addParcelResult value for this AddParcelResponse.
     * 
     * @return addParcelResult
     */
    public com.gls_italy.weblabeling.AddParcelResponseAddParcelResult getAddParcelResult() {
        return addParcelResult;
    }


    /**
     * Sets the addParcelResult value for this AddParcelResponse.
     * 
     * @param addParcelResult
     */
    public void setAddParcelResult(com.gls_italy.weblabeling.AddParcelResponseAddParcelResult addParcelResult) {
        this.addParcelResult = addParcelResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddParcelResponse)) return false;
        AddParcelResponse other = (AddParcelResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addParcelResult==null && other.getAddParcelResult()==null) || 
             (this.addParcelResult!=null &&
              this.addParcelResult.equals(other.getAddParcelResult())));
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
        if (getAddParcelResult() != null) {
            _hashCode += getAddParcelResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddParcelResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://weblabeling.gls-italy.com/", ">AddParcelResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addParcelResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://weblabeling.gls-italy.com/", "AddParcelResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://weblabeling.gls-italy.com/", ">>AddParcelResponse>AddParcelResult"));
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
