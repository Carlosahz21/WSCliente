/**
 * WSConsultaSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost;

public interface WSConsultaSoap extends java.rmi.Remote {

    /**
     * Consulta a la tabla Marca
     */
    public java.lang.String consultaMarca() throws java.rmi.RemoteException;

    /**
     * Insertar datos en la tabla Marca
     */
    public java.lang.String insertarMarca(java.lang.String marca_Id, java.lang.String marca_Nombre) throws java.rmi.RemoteException;
}
