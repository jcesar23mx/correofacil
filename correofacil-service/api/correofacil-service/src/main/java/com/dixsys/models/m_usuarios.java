package com.dixsys.models;

/**
 * Created by jcesar23mx on 10/05/2018.
 */

public class m_usuarios {

    private String usuCuenta;
    private String usuContrasena;
    private String usuCorreo;
    private String usuEstatus;
    private String usuNombre;
    private String usuImagen;

    public m_usuarios() {
    }

    public m_usuarios(String usuCuenta,
                      String usuContrasena,
                      String usuCorreo,
                      String usuEstatus,
                      String usuNombre,
                      String usuImagen) {
        this.usuCuenta = usuCuenta;
        this.usuContrasena = usuContrasena;
        this.usuCorreo = usuCorreo;
        this.usuEstatus = usuEstatus;
        this.usuNombre = usuNombre;
        this.usuImagen = usuImagen;
    }

    public String getUsuCuenta() {
        return usuCuenta;
    }

    public void setUsuCuenta(String usuCuenta) {
        this.usuCuenta = usuCuenta;
    }

    public String getUsuContrasena() {
        return usuContrasena;
    }

    public void setUsuContrasena(String usuContrasena) {
        this.usuContrasena = usuContrasena;
    }

    public String getUsuCorreo() {
        return usuCorreo;
    }

    public void setUsuCorreo(String usuCorreo) {
        this.usuCorreo = usuCorreo;
    }

    public String getUsuEstatus() {
        return usuEstatus;
    }

    public void setUsuEstatus(String usuEstatus) {
        this.usuEstatus = usuEstatus;
    }

    public String getUsuNombre() {
        return usuNombre;
    }

    public void setUsuNombre(String usuNombre) {
        this.usuNombre = usuNombre;
    }

    public String getUsuImagen() {
        return usuImagen;
    }

    public void setUsuImagen(String usuImagen) {
        this.usuImagen = usuImagen;
    }
}
