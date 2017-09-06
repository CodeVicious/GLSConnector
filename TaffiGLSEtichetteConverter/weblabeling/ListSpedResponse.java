/**
 * ListSpedResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gls_italy.weblabeling;

public class ListSpedResponse  implements java.io.Serializable {
    private com.gls_italy.weblabeling.ListSpedResponseListSpedResult listSpedResult;

    public ListSpedResponse() {
    }

    public ListSpedResponse(
           com.gls_italy.weblabeling.ListSpedResponseListSpedResult listSpedResult) {
           this.listSpedResult = listSpedResult;
    }


    /**
     * Gets the listSpedResult value for this ListSpedResponse.
     * 
     * @return listSpedResult
     */
    public com.gls_italy.weblabeling.ListSpedResponseListSpedResult getListSpedResult() {
        return listSpedResult;
    }


    /**
     * Sets the listSpedResult value for this ListSpedResponse.
     * 
     * @param listSpedResult
     */
    public void setListSpedResult(com.gls_italy.weblabeling.ListSpedResponseListSpedResult listSpedResult) {
        this.listSpedResult = listSpedResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListSpedResponse)) return false;
        ListSpedResponse other = (ListSpedResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listSpedResult==null && other.getListSpedResult()==null) || 
             (this.listSpedResult!=null &&
              this.listSpedResult.equals(other.getListSpedResult())));
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
        if (getListSpedResult() != null) {
            _hashCode += getListSpedResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListSpedResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://weblabeling.gls-italy.com/", ">ListSpedResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listSpedResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://weblabeling.gls-italy.com/", "ListSpedResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://weblabeling.gls-italy.com/", ">>ListSpedResponse>ListSpedResult"));
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
