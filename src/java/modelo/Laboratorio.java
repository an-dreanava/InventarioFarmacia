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
public class Laboratorio {
    String id_laboratorio;
    String nombre_laboratorio;
    String f_creacion_lab;
    String usuario_id;
    
    public Laboratorio(){ }

    public Laboratorio(String id_laboratorio, String nombre_laboratorio, String f_creacion_lab, String usuario_id) {
        this.id_laboratorio = id_laboratorio;
        this.nombre_laboratorio = nombre_laboratorio;
        this.f_creacion_lab = f_creacion_lab;
        this.usuario_id = usuario_id;
    }

    public String getId_laboratorio() {
        return id_laboratorio;
    }

    public void setId_laboratorio(String id_laboratorio) {
        this.id_laboratorio = id_laboratorio;
    }

    public String getNombre_laboratorio() {
        return nombre_laboratorio;
    }

    public void setNombre_laboratorio(String nombre_laboratorio) {
        this.nombre_laboratorio = nombre_laboratorio;
    }

    public String getF_creacion_lab() {
        return f_creacion_lab;
    }

    public void setF_creacion_lab(String f_creacion_lab) {
        this.f_creacion_lab = f_creacion_lab;
    }

    public String getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(String usuario_id) {
        this.usuario_id = usuario_id;
    }

    @Override
    public String toString() {
        return "Laboratorio{" + "id_laboratorio=" + id_laboratorio + ", nombre_laboratorio=" + nombre_laboratorio + ", f_creacion_lab=" + f_creacion_lab + ", usuario_id=" + usuario_id + '}';
    }    
}
