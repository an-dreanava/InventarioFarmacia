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
public class Stock {
    private String id_stock;
    private int StockI; //stock inicial
    private int StockM; //stock modificado
    private String descripcion; //accion a realizar
    private int numero_local;
    private String usuario_id;
    private String id_producto;
    private String fecha_modificacion;

    public Stock() {
    }

    public Stock(String id_stock, int StockI, int StockM, String descripcion, int numero_local, String usuario_id, String id_producto, String fecha_modificacion) {
        this.id_stock = id_stock;
        this.StockI = StockI;
        this.StockM = StockM;
        this.descripcion = descripcion;
        this.numero_local = numero_local;
        this.usuario_id = usuario_id;
        this.id_producto = id_producto;
        this.fecha_modificacion = fecha_modificacion;
    }

    public String getId_stock() {
        return id_stock;
    }

    public void setId_stock(String id_stock) {
        this.id_stock = id_stock;
    }

    public int getStockI() {
        return StockI;
    }

    public void setStockI(int StockI) {
        this.StockI = StockI;
    }

    public int getStockM() {
        return StockM;
    }

    public void setStockM(int StockM) {
        this.StockM = StockM;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumero_local() {
        return numero_local;
    }

    public void setNumero_local(int numero_local) {
        this.numero_local = numero_local;
    }

    public String getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(String usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public String getFecha_modificacion() {
        return fecha_modificacion;
    }

    public void setFecha_modificacion(String fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }

    @Override
    public String toString() {
        return "Stock{" + "id_stock=" + id_stock + ", StockI=" + StockI + ", StockM=" + StockM + ", descripcion=" + descripcion + ", numero_local=" + numero_local + ", usuario_id=" + usuario_id + ", id_producto=" + id_producto + ", fecha_modificacion=" + fecha_modificacion + '}';
    }

 
        
    }
