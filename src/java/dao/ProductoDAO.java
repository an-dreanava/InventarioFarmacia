/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import modelo.Producto;
import modelo.Stock;
import modelo.Sucursal;

/**
 *
 * @author drean
 */
public class ProductoDAO {

    Statement stm;
    CallableStatement cst;
    PreparedStatement pst;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection conn;
    String sql = "";

    private static ArrayList<Producto> productos = new ArrayList<>();
    private static ArrayList<Stock> stock = new ArrayList<>();

    public boolean AgregarProducto(String nombre_producto, String usuario_id, String tipo_producto, String id_laboratorio) {
        boolean estado = false;
        int r = 0;

        sql = "{call SP_AGREGAR_PRODUCTO (?,?,?,?)}";
        try {
            conn = c.getConnection();
            cst = conn.prepareCall(sql);
            cst.setString(1, nombre_producto);
            cst.setString(2, usuario_id);
            cst.setString(3, tipo_producto);
            cst.setString(4, id_laboratorio);
            rs = cst.executeQuery();

            rs.close();
            conn.close();

            estado = true;
            System.out.println(">>>nombre_producto:" + nombre_producto + ">>>>usuario" + usuario_id + ">>>tipo:" + tipo_producto + ">>>labo:" + id_laboratorio);

        } catch (SQLException e) {
            System.out.println("Error en agregar producto " + e.getMessage());
        }
        return estado;
    }

    public boolean ModificarStock(int StockI, int StockM, String usuario_id, String descripcion, int numero_local, String id_producto) {
        boolean estado = false;
        int r = 0;

        sql = "{call SP_AGREGAR_STOCK (?,?,?,?,?,?)}";
        try {
            conn = c.getConnection();
            cst = conn.prepareCall(sql);
            cst.setInt(1, StockI);
            cst.setInt(2, StockM);
            cst.setString(3, descripcion);
            cst.setInt(4, numero_local);
            cst.setString(5, usuario_id);
            cst.setString(6, id_producto);
            rs = cst.executeQuery();

            rs.close();
            conn.close();

            estado = true;
            System.out.println(">>>StockI:" + StockI + ">>>>usuario" + usuario_id );

        } catch (SQLException e) {
            System.out.println("Error en modificar stock " + e.getMessage());
        }
        return estado;
    }

    public boolean EliminarProducto(String id_producto) {
        boolean estado = false;
        int r = 0;

        sql = "{call SP_ELIMINAR_PRODUCTO (?)}";
        try {
            conn = c.getConnection();
            cst = conn.prepareCall(sql);
            cst.setString(1, id_producto);
            rs = cst.executeQuery();

            rs.close();
            conn.close();

            estado = true;
            System.out.println(">>>id_producto:" + id_producto + ">>>>estado" + estado);

        } catch (SQLException e) {
            System.out.println("Error en eliminar producto " + e.getMessage());
        }
        return estado;
    }

    public boolean ModificarProducto(String id_producto, String nombre_producto, String usuario_id, String tipo_producto, String id_laboratorio) {
        boolean estado = false;
        int r = 0;

        sql = "{call sp_modificar_producto (?,?,?,?,?)}";
        try {
            conn = c.getConnection();
            cst = conn.prepareCall(sql);
            cst.setString(1, id_producto);
            cst.setString(2, nombre_producto);
            cst.setString(3, usuario_id);
            cst.setString(4, tipo_producto);
            cst.setString(5, id_laboratorio);
            rs = cst.executeQuery();

            rs.close();
            conn.close();

            estado = true;
            System.out.println(">>>nombre_producto:" + nombre_producto + ">>>>usuario" + usuario_id + ">>>tipo:" + tipo_producto + ">>>labo:" + id_laboratorio);

        } catch (SQLException e) {
            System.out.println("Error en modificar producto " + e.getMessage());
        }
        return estado;
    }

    public Producto BuscarProducto(String id_producto) {
        boolean estado = false;
        int r = 0;
        Producto producto = null;

        sql = "{call SP_MOSTRAR_PRODUCTO_OUT (?,?,?,?,?,?)}";
        try {
            conn = c.getConnection();
            cst = conn.prepareCall(sql);
            cst.setString(1, id_producto);
            cst.registerOutParameter(1, Types.VARCHAR);
            cst.registerOutParameter(2, Types.VARCHAR);
            cst.registerOutParameter(3, Types.DATE);
            cst.registerOutParameter(4, Types.VARCHAR);
            cst.registerOutParameter(5, Types.VARCHAR);
            cst.registerOutParameter(6, Types.VARCHAR);
            rs = cst.executeQuery();

            String nombre_producto = "", fecha = "", usuario = "", tipo = "", nombre_laboratorio = "";

            id_producto = cst.getString(1);
            nombre_producto = cst.getString(2);
            fecha = cst.getString(3);
            usuario = cst.getString(4);
            tipo = cst.getString(5);
            nombre_laboratorio = cst.getString(6);

            rs.close();
            conn.close();

            producto = new Producto(id_producto, nombre_producto, fecha, tipo, nombre_laboratorio, usuario);
            estado = true;
            System.out.println(">>>Producto:" + producto + ">>>>>Estado" + estado);

        } catch (SQLException e) {
            System.out.println("Error en buscar producto " + e.getMessage());
        }
        return producto;
    }

    public ArrayList<Producto> ObtenerDatosProducto() {
        productos.clear();
        System.out.println("entro al ObtenerDatos ");
        sql = "SELECT p.id_producto, p.nombre_producto, p.f_creacion_producto, p.usuario_id_usuario, l.nombre_laboratorio,t.nombre_tipo "
                + "FROM (producto p INNER JOIN tipo_producto t ON p.producto_tipo_producto = t.id_tipo) "
                + "INNER JOIN laboratorio l ON p.laboratorio_id_laboratorio = l.id_laboratorio";
        try {
            conn = c.getConnection();
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery(sql);

            String id_producto, nombre_producto = "", fecha = "", usuario = "", tipo = "", nombre_laboratorio = "";

            while (rs.next()) {
                id_producto = rs.getString(1);
                nombre_producto = rs.getString(2);
                fecha = rs.getString(3);
                usuario = rs.getString(4);
                nombre_laboratorio = rs.getString(5);
                tipo = rs.getString(6);

                Producto producto = new Producto(id_producto, nombre_producto, fecha, tipo, nombre_laboratorio, usuario);

                productos.add(producto);
            }

            pst.close();
            conn.close();
            System.out.println(">>>productos:" + productos);
        } catch (SQLException e) {
            System.out.println("Error en ObtenerDatos " + e.getMessage());
        }
        return productos;
    }
        public ArrayList<Stock> ListarStockProducto() {
            Stock new_stock = null;
            stock.clear();
        boolean estado = false;

            sql = "SELECT s.id_stock,s.stock_inical,s.stock_modificado,s.detalle_modificacion, "
                    + "s.sucursal_id_sucursal,s.usuario_id_usuario,p.nombre_producto,s.fecha_modificacion "
                    + "FROM stock s INNER JOIN producto p "
                    + "ON s.producto_id_producto=p.id_producto";
        try {
            conn = c.getConnection();
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery(sql);

            
            String detalle_modificacion = "",producto_id_producto="";
            String usuario_id_usuario = "", fecha_modificacion="",id_stock = "";
            int stock_inicial=0, stock_modificado = 0,sucursal_id_sucursal=0;

            while (rs.next()) {
                id_stock = rs.getString(1);
                stock_inicial = rs.getInt(2);
                stock_modificado = rs.getInt(3);
                detalle_modificacion = rs.getString(4);
                sucursal_id_sucursal = rs.getInt(5);
                usuario_id_usuario = rs.getString(6);
                producto_id_producto = rs.getString(7);
                fecha_modificacion = rs.getString(8);
                

                new_stock = new Stock (id_stock,stock_inicial,stock_modificado,detalle_modificacion,sucursal_id_sucursal, usuario_id_usuario, producto_id_producto, fecha_modificacion);
                stock.add(new_stock);
            }
            rs.close();
            conn.close();

            estado = true;
            System.out.println(">>>Stock" + stock + ">>>>>Estado" + estado);

        } catch (SQLException e) {
            System.out.println("Error en listar stock " + e.getMessage());
        }

        return stock;
    }
}
