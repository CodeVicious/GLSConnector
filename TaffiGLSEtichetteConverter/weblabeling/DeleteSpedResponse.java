/**
 * DeleteSpedResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gls_italy.weblabeling;

public class DeleteSpedResponse  implements java.io.Serializable {
    private com.gls_italy.weblabeling.DeleteSpedResponseDeleteSpedResult deleteSpedResult;

    public DeleteSpedResponse() {
    }

    public DeleteSpedResponse(
           com.gls_italy.weblabeling.DeleteSpedResponseDeleteSpedResult deleteSpedResult) {
           this.deleteSpedResult = deleteSpedResult;
    }


    /**
     * Gets the deleteSpedResult value for this DeleteSpedResponse.
     * 
     * @return deleteSpedResult
     */
    public com.gls_italy.weblabeling.DeleteSpedResponseDeleteSpedResult getDeleteSpedResult() {
        return deleteSpedResult;
    }


    /**
     * Sets the deleteSpedResult value for this DeleteSpedResponse.
     * 
     * @param deleteSpedResult
     */
    public void setDeleteSpedResult(com.gls_italy.weblabeling.DeleteSpedResponseDeleteSpedResult deleteSpedResult) {
        this.deleteSpedResult = deleteSpedResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteSpedResponse)) return false;
        DeleteSpedResponse other = (DeleteSpedResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deleteSpedResult==null && other.getDeleteSpedResult()==null) || 
             (this.deleteSpedResult!=null &&
              this.deleteSpedResult.equals(other.getDeleteSpedResult())));
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
        if (getDeleteSpedResult() != null) {
            _hashCode += getDeleteSpedResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteSpedResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://weblabeling.gls-italy.com/", ">DeleteSpedResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteSpedResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://weblabeling.gls-italy.com/", "DeleteSpedResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://weblabeling.gls-italy.com/", ">>DeleteSpedResponse>DeleteSpedResult"));
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
