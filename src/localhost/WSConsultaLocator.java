/**
 * WSConsultaLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost;

public class WSConsultaLocator extends org.apache.axis.client.Service implements localhost.WSConsulta {

/**
 * Consultas a la Base de datos
 */

    public WSConsultaLocator() {
    }


    public WSConsultaLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSConsultaLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSConsultaSoap
    private java.lang.String WSConsultaSoap_address = "http://localhost:122/WSConsulta.asmx";

    public java.lang.String getWSConsultaSoapAddress() {
        return WSConsultaSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSConsultaSoapWSDDServiceName = "WSConsultaSoap";

    public java.lang.String getWSConsultaSoapWSDDServiceName() {
        return WSConsultaSoapWSDDServiceName;
    }

    public void setWSConsultaSoapWSDDServiceName(java.lang.String name) {
        WSConsultaSoapWSDDServiceName = name;
    }

    public localhost.WSConsultaSoap getWSConsultaSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSConsultaSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSConsultaSoap(endpoint);
    }

    public localhost.WSConsultaSoap getWSConsultaSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            localhost.WSConsultaSoapStub _stub = new localhost.WSConsultaSoapStub(portAddress, this);
            _stub.setPortName(getWSConsultaSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSConsultaSoapEndpointAddress(java.lang.String address) {
        WSConsultaSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (localhost.WSConsultaSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                localhost.WSConsultaSoapStub _stub = new localhost.WSConsultaSoapStub(new java.net.URL(WSConsultaSoap_address), this);
                _stub.setPortName(getWSConsultaSoapWSDDServiceName());
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
        if ("WSConsultaSoap".equals(inputPortName)) {
            return getWSConsultaSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://localhost/", "WSConsulta");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://localhost/", "WSConsultaSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSConsultaSoap".equals(portName)) {
            setWSConsultaSoapEndpointAddress(address);
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
