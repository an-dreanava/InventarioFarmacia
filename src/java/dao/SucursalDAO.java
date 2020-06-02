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
import java.util.ArrayList;
import java.sql.Types;
import modelo.Sucursal;

/**
 *
 * @author drean
 */
public class SucursalDAO {

    Statement stm;
    CallableStatement cst;
    PreparedStatement pst;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection conn;
    String sql = "";

    private static ArrayList<Sucursal> sucursales = new ArrayList<>();

    public boolean AgregarSucursal(int numero_local, String direccion, String id_usuario) {
        boolean estado = false;
        int r = 0;

        sql = "{call sp_agregar_sucursal (?,?,?)}";
        try {
            conn = c.getConnection();
            cst = conn.prepareCall(sql);
            cst.setInt(1, numero_local);
            cst.setString(2, direccion);
            cst.setString(3, id_usuario);
            rs = cst.executeQuery();

            rs.close();
            conn.close();

            estado = true;
            System.out.println(">>>numero local:" + numero_local + ">>>>direccion" + direccion + ">>>id_usuario:" + id_usuario);

        } catch (SQLException e) {
            System.out.println("Error en agregar sucursal " + e.getMessage());
        }
        return estado;
    }

    public boolean EliminarSucursal(int numero_local) {
        boolean estado = false;
        int r = 0;

        sql = "{call sp_agregar_sucursal (?,?,?)}";
        try {
            conn = c.getConnection();
            cst = conn.prepareCall(sql);
            cst.setInt(1, numero_local);
            rs = cst.executeQuery();

            rs.close();
            conn.close();

            estado = true;
            System.out.println(">>>numero local:" + numero_local);

        } catch (SQLException e) {
            System.out.println("Error en eliminar sucursal " + e.getMessage());
        }
        return estado;
    }

    public Sucursal BuscarSucursal(int numero_local) {
        boolean estado = false;
        int r = 0;
        Sucursal new_sucursal = null;

        sql = "{call BUSCAR_SUCURSAL_OUTPUT (?,?,?,?)}";
        try {
            conn = c.getConnection();
            cst = conn.prepareCall(sql);
            cst.setInt(1, numero_local);
            cst.registerOutParameter(1, Types.INTEGER);
            cst.registerOutParameter(2, Types.DATE);
            cst.registerOutParameter(3, Types.VARCHAR);
            cst.registerOutParameter(4, Types.VARCHAR);
            rs = cst.executeQuery();

            String fecha_creacion = "", usuario_id = "", direccion = "";

            numero_local = cst.getInt(1);
            fecha_creacion = cst.getString(2);
            usuario_id = cst.getString(3);
            direccion = cst.getString(4);

            rs.close();
            conn.close();

            new_sucursal = new Sucursal(numero_local, fecha_creacion, usuario_id, direccion);
            estado = true;
            System.out.println(">>>Sucursal:" + new_sucursal + ">>>>>Estado" + estado);

        } catch (SQLException e) {
            System.out.println("Error en eliminar sucursal " + e.getMessage());
        }
        return new_sucursal;
    }

    public ArrayList<Sucursal> ListarSucursal() {
        boolean estado = false;

        sql = "SELECT * FROM sucursal";
        try {
            conn = c.getConnection();
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery(sql);

            String fecha_creacion = "", usuario_id = "", direccion = "";
            int numero_local = 0;

            while (rs.next()) {
                numero_local = rs.getInt(1);
                fecha_creacion = rs.getString(2);
                usuario_id = rs.getString(3);
                direccion = rs.getString(4);

                Sucursal new_sucursal = new Sucursal(numero_local, fecha_creacion, usuario_id, direccion);
                sucursales.add(new_sucursal);
            }
            rs.close();
            conn.close();

            estado = true;
            System.out.println(">>>Sucursal:" + sucursales + ">>>>>Estado" + estado);

        } catch (SQLException e) {
            System.out.println("Error en listar sucursal " + e.getMessage());
        }

        return sucursales;
    }

    public boolean ModificarSucursal(int numero_local, String usuario_id, String direccion) {
        boolean estado = false;
        int r = 0;

        sql = "{call SP_MODIFICAR_SUCURSAL (?,?,?)}";
        try {
            conn = c.getConnection();
            cst = conn.prepareCall(sql);
            cst.setInt(1, numero_local);
            cst.setString(2, usuario_id);
            cst.setString(3, direccion);
            rs = cst.executeQuery();

            rs.close();
            conn.close();

            estado = true;
            System.out.println(">>>numero local:" + numero_local + ">>>direccion" + direccion + ">>>usuario" + usuario_id);

        } catch (SQLException e) {
            System.out.println("Error en modificar sucursal " + e.getMessage());
        }
        return estado;
    }

}
