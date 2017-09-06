/**
 * CloseWorkDayResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gls_italy.weblabeling;

public class CloseWorkDayResponse  implements java.io.Serializable {
    private com.gls_italy.weblabeling.CloseWorkDayResponseCloseWorkDayResult closeWorkDayResult;

    public CloseWorkDayResponse() {
    }

    public CloseWorkDayResponse(
           com.gls_italy.weblabeling.CloseWorkDayResponseCloseWorkDayResult closeWorkDayResult) {
           this.closeWorkDayResult = closeWorkDayResult;
    }


    /**
     * Gets the closeWorkDayResult value for this CloseWorkDayResponse.
     * 
     * @return closeWorkDayResult
     */
    public com.gls_italy.weblabeling.CloseWorkDayResponseCloseWorkDayResult getCloseWorkDayResult() {
        return closeWorkDayResult;
    }


    /**
     * Sets the closeWorkDayResult value for this CloseWorkDayResponse.
     * 
     * @param closeWorkDayResult
     */
    public void setCloseWorkDayResult(com.gls_italy.weblabeling.CloseWorkDayResponseCloseWorkDayResult closeWorkDayResult) {
        this.closeWorkDayResult = closeWorkDayResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CloseWorkDayResponse)) return false;
        CloseWorkDayResponse other = (CloseWorkDayResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.closeWorkDayResult==null && other.getCloseWorkDayResult()==null) || 
             (this.closeWorkDayResult!=null &&
              this.closeWorkDayResult.equals(other.getCloseWorkDayResult())));
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
        if (getCloseWorkDayResult() != null) {
            _hashCode += getCloseWorkDayResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CloseWorkDayResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://weblabeling.gls-italy.com/", ">CloseWorkDayResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closeWorkDayResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://weblabeling.gls-italy.com/", "CloseWorkDayResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://weblabeling.gls-italy.com/", ">>CloseWorkDayResponse>CloseWorkDayResult"));
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
