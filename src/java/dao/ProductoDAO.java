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

    public Producto BuscarProducto(String id_producto) {
        boolean estado = false;
        int r = 0;
        Producto producto = null;

        sql = "SELECT ID_PRODUCTO,NOMBRE_PRODUCTO,F_CREACION_PRODUCTO,USUARIO_ID_USUARIO,PRODUCTO_TIPO_PRODUCTO,LABORATORIO_ID_LABORATORIO FROM producto WHERE id_producto='" + id_producto + "'";
        try {
            conn = c.getConnection();
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery(sql);

            String nombre_producto = "", fecha = "", usuario = "", tipo = "", nombre_laboratorio = "";

            while (rs.next()) {
                id_producto = rs.getString(1);
                nombre_producto = rs.getString(2);
                fecha = rs.getString(3);
                usuario = rs.getString(4);
                tipo = rs.getString(5);
                nombre_laboratorio = rs.getString(6);
            }

            rs.close();
            conn.close();

            producto = new Producto(id_producto, nombre_producto, fecha, tipo, nombre_laboratorio, usuario);
            estado = true;
            System.out.println(">>>Producto:" + producto + ">>>>>Estado" + estado);

        } catch (SQLException e) {
            System.out.println("Error en mostrar producto " + e.getMessage());
        }
        return producto;
    }
}
