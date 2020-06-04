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
public class Producto {

    private String id_producto;
    private String nombre_producto;
    private String fecha;
    private String tipo_producto;
    private String id_laboratorio;
    private String usuario_id;

    public Producto() {
    }

    public Producto(String id_producto, String nombre_producto, String fecha, String tipo_producto, String id_laboratorio, String usuario_id) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.fecha = fecha;
        this.tipo_producto = tipo_producto;
        this.id_laboratorio = id_laboratorio;
        this.usuario_id = usuario_id;
    }

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo_producto() {
        return tipo_producto;
    }

    public void setTipo_producto(String tipo_producto) {
        this.tipo_producto = tipo_producto;
    }

    public String getId_laboratorio() {
        return id_laboratorio;
    }

    public void setId_laboratorio(String id_laboratorio) {
        this.id_laboratorio = id_laboratorio;
    }

    public String getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(String usuario_id) {
        this.usuario_id = usuario_id;
    }

    @Override
    public String toString() {
        return "Producto{" + "id_producto=" + id_producto + ", nombre_producto=" + nombre_producto + ", fecha=" + fecha + ", tipo_producto=" + tipo_producto + ", id_laboratorio=" + id_laboratorio + ", usuario_id=" + usuario_id + '}';
    }
}
