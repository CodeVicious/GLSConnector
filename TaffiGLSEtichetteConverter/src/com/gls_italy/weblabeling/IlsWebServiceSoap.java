/**
 * IlsWebServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gls_italy.weblabeling;

public interface IlsWebServiceSoap extends java.rmi.Remote {

    /**
     * Ritorna in un array di byte il pdf.
     */
    public byte[] getPdf(java.lang.String sedeGls, int codiceCliente, java.lang.String password, int codiceContratto, long contatoreProgressivo) throws java.rmi.RemoteException;

    /**
     * Ritorna la sequenza dei comandi ZPL per la stampa dell'etichetta.
     */
    public com.gls_italy.weblabeling.GetZplResponseGetZplResult getZpl(java.lang.String sedeGls, int codiceCliente, java.lang.String password, int codiceContratto, long contatoreProgressivo) throws java.rmi.RemoteException;

    /**
     * Inserisce le informazioni dei colli e ritorna le relative informazioni
     * per la stampa dello stessi.
     */
    public com.gls_italy.weblabeling.AddParcelResponseAddParcelResult addParcel(java.lang.String XMLInfoParcel) throws java.rmi.RemoteException;

    /**
     * Invia le informazioni definitive di chiusura delle spedizioni
     * e ritorna lo stato delle spedizioni (Esegue la trasmissione in sede.)
     */
    public com.gls_italy.weblabeling.CloseWorkDayResponseCloseWorkDayResult closeWorkDay(java.lang.String XMLCloseInfoParcel) throws java.rmi.RemoteException;

    /**
     * Elimina la spedizione.
     */
    public com.gls_italy.weblabeling.DeleteSpedResponseDeleteSpedResult deleteSped(java.lang.String sedeGls, java.lang.String codiceClienteGls, java.lang.String passwordClienteGls, java.lang.String numSpedizione) throws java.rmi.RemoteException;

    /**
     * Ritorna l'elenco delle spedizioni registrate degli ultimi 4
     * mesi.
     */
    public com.gls_italy.weblabeling.ListSpedResponseListSpedResult listSped(java.lang.String sedeGls, java.lang.String codiceClienteGls, java.lang.String passwordClienteGls) throws java.rmi.RemoteException;
}
