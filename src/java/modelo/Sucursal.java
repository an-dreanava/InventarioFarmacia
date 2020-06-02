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
public class Sucursal {
    private int numero_local;
    private String fecha_creacion;
    private String usuario_id;
    private String direccion;
    
    public Sucursal(){};

    public Sucursal(int numero_local, String fecha_creacion, String usuario_id, String direccion) {
        this.numero_local = numero_local;
        this.fecha_creacion = fecha_creacion;
        this.usuario_id = usuario_id;
        this.direccion = direccion;
    }

    public int getNumero_local() {
        return numero_local;
    }

    public void setNumero_local(int numero_local) {
        this.numero_local = numero_local;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(String usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Sucursal{" + "numero_local=" + numero_local + ", fecha_creacion=" + fecha_creacion + ", usuario_id=" + usuario_id + ", direccion=" + direccion + '}';
    }
}
