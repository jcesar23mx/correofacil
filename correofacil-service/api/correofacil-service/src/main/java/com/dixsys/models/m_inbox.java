package com.dixsys.models;

/**
 * Created by jcesar23mx on 15/05/2018.
 */
public class m_inbox {
    private Integer inboxID;
    private Integer inboxUsuario;
    private String inboxCategoria;

    public m_inbox() {
    }

    public m_inbox(Integer inboxID, Integer inboxUsuario, String inboxCategoria) {
        this.inboxID = inboxID;
        this.inboxUsuario = inboxUsuario;
        this.inboxCategoria = inboxCategoria;
    }

    public Integer getInboxID() {
        return inboxID;
    }

    public void setInboxID(Integer inboxID) {
        this.inboxID = inboxID;
    }

    public Integer getInboxUsuario() {
        return inboxUsuario;
    }

    public void setInboxUsuario(Integer inboxUsuario) {
        this.inboxUsuario = inboxUsuario;
    }

    public String getInboxCategoria() {
        return inboxCategoria;
    }

    public void setInboxCategoria(String inboxCategoria) {
        this.inboxCategoria = inboxCategoria;
    }
}
