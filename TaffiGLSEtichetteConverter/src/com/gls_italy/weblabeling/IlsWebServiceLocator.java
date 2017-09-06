/**
 * IlsWebServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gls_italy.weblabeling;

public class IlsWebServiceLocator extends org.apache.axis.client.Service implements com.gls_italy.weblabeling.IlsWebService {

    public IlsWebServiceLocator() {
    }


    public IlsWebServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IlsWebServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IlsWebServiceSoap
    private java.lang.String IlsWebServiceSoap_address = "https://weblabeling.gls-italy.com/IlsWebService.asmx";

    public java.lang.String getIlsWebServiceSoapAddress() {
        return IlsWebServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IlsWebServiceSoapWSDDServiceName = "IlsWebServiceSoap";

    public java.lang.String getIlsWebServiceSoapWSDDServiceName() {
        return IlsWebServiceSoapWSDDServiceName;
    }

    public void setIlsWebServiceSoapWSDDServiceName(java.lang.String name) {
        IlsWebServiceSoapWSDDServiceName = name;
    }

    public com.gls_italy.weblabeling.IlsWebServiceSoap getIlsWebServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IlsWebServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIlsWebServiceSoap(endpoint);
    }

    public com.gls_italy.weblabeling.IlsWebServiceSoap getIlsWebServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.gls_italy.weblabeling.IlsWebServiceSoapStub _stub = new com.gls_italy.weblabeling.IlsWebServiceSoapStub(portAddress, this);
            _stub.setPortName(getIlsWebServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIlsWebServiceSoapEndpointAddress(java.lang.String address) {
        IlsWebServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.gls_italy.weblabeling.IlsWebServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.gls_italy.weblabeling.IlsWebServiceSoapStub _stub = new com.gls_italy.weblabeling.IlsWebServiceSoapStub(new java.net.URL(IlsWebServiceSoap_address), this);
                _stub.setPortName(getIlsWebServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("IlsWebServiceSoap".equals(inputPortName)) {
            return getIlsWebServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://weblabeling.gls-italy.com/", "IlsWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://weblabeling.gls-italy.com/", "IlsWebServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IlsWebServiceSoap".equals(portName)) {
            setIlsWebServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
