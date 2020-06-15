/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author drean
 */
public class Usuario {

    private String usuario_id;
    private String usuario_clave;
    private String nombre_usuario;
    private String tipo_usuario;

    public Usuario(String usuario_id, String usuario_clave, String nombre_usuario, String tipo_usuario) {
        this.usuario_id = usuario_id;
        this.usuario_clave = usuario_clave;
        this.nombre_usuario = nombre_usuario;
        this.tipo_usuario = tipo_usuario;
    }

    public String getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(String usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getUsuario_clave() {
        return usuario_clave;
    }

    public void setUsuario_clave(String usuario_clave) {
        this.usuario_clave = usuario_clave;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario_id=" + usuario_id + ", usuario_clave=" + usuario_clave + ", nombre_usuario=" + nombre_usuario + ", tipo_usuario=" + tipo_usuario + '}';
    }
    

}
