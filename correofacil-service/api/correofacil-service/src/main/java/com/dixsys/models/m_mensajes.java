package com.dixsys.models;

public class m_mensajes {
    private Integer msjID;
    private String msjAsunto;
    private String msjTexto;
    private String msjFechaOficio;
    private String msjFechaRecibido;
    private String msjFechaCaptura;
    private Integer inboxID;
    private String inboxName;
    private Integer sentID;
    private String sentName;
    private Integer remitenteID;
    private String rmtRazonSocial;
    private Integer msjEstatus;

    public m_mensajes() {
    }

    public m_mensajes(Integer msjID, String msjAsunto, String msjTexto,
                      String msjFechaOficio, String msjFechaRecibido,
                      String msjFechaCaptura, Integer inboxID, String inboxName,
                      Integer sentID, String sentNombre, Integer remitenteID,
                      String rmtRazonSocial, Integer msjEstatus) {
        this.msjID = msjID;
        this.msjAsunto = msjAsunto;
        this.msjTexto = msjTexto;
        this.msjFechaOficio = msjFechaOficio;
        this.msjFechaRecibido = msjFechaRecibido;
        this.msjFechaCaptura = msjFechaCaptura;
        this.inboxID = inboxID;
        this.inboxName = inboxName;
        this.sentID = sentID;
        this.sentName = sentNombre;
        this.remitenteID = remitenteID;
        this.rmtRazonSocial = rmtRazonSocial;
        this.msjEstatus = msjEstatus;
    }

    public Integer getMsjID() {
        return msjID;
    }

    public void setMsjID(Integer msjID) {
        this.msjID = msjID;
    }

    public String getMsjAsunto() {
        return msjAsunto;
    }

    public void setMsjAsunto(String msjAsunto) {
        this.msjAsunto = msjAsunto;
    }

    public String getMsjTexto() {
        return msjTexto;
    }

    public void setMsjTexto(String msjTexto) {
        this.msjTexto = msjTexto;
    }

    public String getMsjFechaOficio() {
        return msjFechaOficio;
    }

    public void setMsjFechaOficio(String msjFechaOficio) {
        this.msjFechaOficio = msjFechaOficio;
    }

    public String getMsjFechaRecepcion() {
        return msjFechaRecibido;
    }

    public void setMsjFechaRecepcion(String msjFechaRecepcion) {
        this.msjFechaRecibido = msjFechaRecepcion;
    }

    public String getMsjFechaCaptura() {
        return msjFechaCaptura;
    }

    public void setMsjFechaCaptura(String msjFechaCaptura) {
        this.msjFechaCaptura = msjFechaCaptura;
    }

    public Integer getInboxID() {
        return inboxID;
    }

    public void setInboxID(Integer inboxID) {
        this.inboxID = inboxID;
    }

    public String getInboxName() {
        return inboxName;
    }

    public void setInboxName(String inboxName) {
        this.inboxName = inboxName;
    }

    public Integer getSentID() {
        return sentID;
    }

    public void setSentID(Integer sentID) {
        this.sentID = sentID;
    }

    public String getSentName() {
        return sentName;
    }

    public void setSentName(String sentNombre) {
        this.sentName = sentNombre;
    }

    public Integer getRemitenteID() {
        return remitenteID;
    }

    public void setRemitenteID(Integer remitenteID) {
        this.remitenteID = remitenteID;
    }

    public String getrmtRazonSocial() {
        return rmtRazonSocial;
    }

    public void setRrmtRazonSocial(String remitenteNombre) {
        this.rmtRazonSocial = remitenteNombre;
    }

    public Integer getMsjEstatus() {
        return msjEstatus;
    }

    public void setMsjEstatus(Integer msjEstatus) {
        this.msjEstatus = msjEstatus;
    }
}
