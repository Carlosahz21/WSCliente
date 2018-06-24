/**
 * WSConsulta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost;

public interface WSConsulta extends javax.xml.rpc.Service {

/**
 * Consultas a la Base de datos
 */
    public java.lang.String getWSConsultaSoapAddress();

    public localhost.WSConsultaSoap getWSConsultaSoap() throws javax.xml.rpc.ServiceException;

    public localhost.WSConsultaSoap getWSConsultaSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
