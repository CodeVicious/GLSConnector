package com.gls_italy.weblabeling;

public class IlsWebServiceSoapProxy implements com.gls_italy.weblabeling.IlsWebServiceSoap {
  private String _endpoint = null;
  private com.gls_italy.weblabeling.IlsWebServiceSoap ilsWebServiceSoap = null;
  
  public IlsWebServiceSoapProxy() {
    _initIlsWebServiceSoapProxy();
  }
  
  public IlsWebServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initIlsWebServiceSoapProxy();
  }
  
  private void _initIlsWebServiceSoapProxy() {
    try {
      ilsWebServiceSoap = (new com.gls_italy.weblabeling.IlsWebServiceLocator()).getIlsWebServiceSoap();
      if (ilsWebServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)ilsWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)ilsWebServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (ilsWebServiceSoap != null)
      ((javax.xml.rpc.Stub)ilsWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.gls_italy.weblabeling.IlsWebServiceSoap getIlsWebServiceSoap() {
    if (ilsWebServiceSoap == null)
      _initIlsWebServiceSoapProxy();
    return ilsWebServiceSoap;
  }
  
  public byte[] getPdf(java.lang.String sedeGls, int codiceCliente, java.lang.String password, int codiceContratto, long contatoreProgressivo) throws java.rmi.RemoteException{
    if (ilsWebServiceSoap == null)
      _initIlsWebServiceSoapProxy();
    return ilsWebServiceSoap.getPdf(sedeGls, codiceCliente, password, codiceContratto, contatoreProgressivo);
  }
  
  public com.gls_italy.weblabeling.GetZplResponseGetZplResult getZpl(java.lang.String sedeGls, int codiceCliente, java.lang.String password, int codiceContratto, long contatoreProgressivo) throws java.rmi.RemoteException{
    if (ilsWebServiceSoap == null)
      _initIlsWebServiceSoapProxy();
    return ilsWebServiceSoap.getZpl(sedeGls, codiceCliente, password, codiceContratto, contatoreProgressivo);
  }
  
  public com.gls_italy.weblabeling.AddParcelResponseAddParcelResult addParcel(java.lang.String XMLInfoParcel) throws java.rmi.RemoteException{
    if (ilsWebServiceSoap == null)
      _initIlsWebServiceSoapProxy();
    return ilsWebServiceSoap.addParcel(XMLInfoParcel);
  }
  
  public com.gls_italy.weblabeling.CloseWorkDayResponseCloseWorkDayResult closeWorkDay(java.lang.String XMLCloseInfoParcel) throws java.rmi.RemoteException{
    if (ilsWebServiceSoap == null)
      _initIlsWebServiceSoapProxy();
    return ilsWebServiceSoap.closeWorkDay(XMLCloseInfoParcel);
  }
  
  public com.gls_italy.weblabeling.DeleteSpedResponseDeleteSpedResult deleteSped(java.lang.String sedeGls, java.lang.String codiceClienteGls, java.lang.String passwordClienteGls, java.lang.String numSpedizione) throws java.rmi.RemoteException{
    if (ilsWebServiceSoap == null)
      _initIlsWebServiceSoapProxy();
    return ilsWebServiceSoap.deleteSped(sedeGls, codiceClienteGls, passwordClienteGls, numSpedizione);
  }
  
  public com.gls_italy.weblabeling.ListSpedResponseListSpedResult listSped(java.lang.String sedeGls, java.lang.String codiceClienteGls, java.lang.String passwordClienteGls) throws java.rmi.RemoteException{
    if (ilsWebServiceSoap == null)
      _initIlsWebServiceSoapProxy();
    return ilsWebServiceSoap.listSped(sedeGls, codiceClienteGls, passwordClienteGls);
  }
  
  
}