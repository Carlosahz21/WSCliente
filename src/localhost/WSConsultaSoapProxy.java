package localhost;

public class WSConsultaSoapProxy implements localhost.WSConsultaSoap {
  private String _endpoint = null;
  private localhost.WSConsultaSoap wSConsultaSoap = null;
  
  public WSConsultaSoapProxy() {
    _initWSConsultaSoapProxy();
  }
  
  public WSConsultaSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSConsultaSoapProxy();
  }
  
  private void _initWSConsultaSoapProxy() {
    try {
      wSConsultaSoap = (new localhost.WSConsultaLocator()).getWSConsultaSoap();
      if (wSConsultaSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSConsultaSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSConsultaSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSConsultaSoap != null)
      ((javax.xml.rpc.Stub)wSConsultaSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public localhost.WSConsultaSoap getWSConsultaSoap() {
    if (wSConsultaSoap == null)
      _initWSConsultaSoapProxy();
    return wSConsultaSoap;
  }
  
  public java.lang.String consultaMarca() throws java.rmi.RemoteException{
    if (wSConsultaSoap == null)
      _initWSConsultaSoapProxy();
    return wSConsultaSoap.consultaMarca();
  }
  
  public java.lang.String insertarMarca(java.lang.String marca_Id, java.lang.String marca_Nombre) throws java.rmi.RemoteException{
    if (wSConsultaSoap == null)
      _initWSConsultaSoapProxy();
    return wSConsultaSoap.insertarMarca(marca_Id, marca_Nombre);
  }
  
  
}