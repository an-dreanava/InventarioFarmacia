package dao;

import conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import modelo.Laboratorio;

public class LaboratorioDAO {

    Statement stm;
    CallableStatement cst;
    PreparedStatement pst;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection conn;
    String sql = "";

    private static ArrayList<Laboratorio> laboratorios = new ArrayList<>();

    public static String fecha() {
        Date fecha = new Date();
        String fecha_actual = (fecha.getDate() + "/" + (fecha.getMonth() + 1) + "/" + (fecha.getYear() + 1900));
        return fecha_actual;
    }

    public static String id_laboratorio() {
        String id_laboratorio = "";

        return id_laboratorio;
    }

    public int agregar(String nombre_laboratorio, String usuario_id, String id_laboratorio) {
        System.out.println("entro al agregar " + nombre_laboratorio + ">>" + usuario_id + ">>" + id_laboratorio);
        int r = 0;
        sql = "INSERT INTO laboratorio(id_laboratorio,nombre_laboratorio,f_creacion_lab,usuario_id_usuario)"
                + "VALUES(?,?,?,?)";
        try {
            conn = c.getConnection();
            pst = conn.prepareStatement(sql);
            pst.setString(1, id_laboratorio);
            pst.setString(2, nombre_laboratorio);
            pst.setString(3, LaboratorioDAO.fecha());
            pst.setString(4, usuario_id);
            r = pst.executeUpdate();
            pst.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Error en grabar " + e.getMessage());
        }

        System.out.println("salió del agregar");
        return r;
    }

    public boolean AgregarLaboratotio(String nombre_laboratorio, String id_usuario) {
        boolean estado = false;
        int r = 0;

        sql = "{call sp_agregar_laboratorio (?,?)}";
        try {
            conn = c.getConnection();
            cst = conn.prepareCall(sql);
            cst.setString(1, nombre_laboratorio);
            cst.setString(2, id_usuario);
            rs = cst.executeQuery();

            rs.close();
            conn.close();

            estado = true;
            System.out.println(">>>nombre_laboratorio:" + nombre_laboratorio + ">>>id_usuario:" + id_usuario);

        } catch (SQLException e) {
            System.out.println("Error en grabar " + e.getMessage());
        }
        return estado;
    }

    public int Eliminar(String id_laboratorio) {
        System.out.println("entro al eliminar " + id_laboratorio);
        int r = 0;
        sql = "DELETE FROM laboratorio WHERE id_laboratorio= (?)";
        try {
            conn = c.getConnection();
            pst = conn.prepareStatement(sql);
            pst.setString(1, id_laboratorio);
            r = pst.executeUpdate();
            pst.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Error en eliminar " + e.getMessage());
        }

        System.out.println("salió del eliminar");
        return r;
    }

    public ArrayList<Laboratorio> ObtenerDatos() {
        System.out.println("entro al ObtenerDatos ");
        sql = "SELECT * FROM laboratorio";
        try {
            conn = c.getConnection();
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery(sql);

            String id_laboratorio = "", nombre_laboratorio = "", f_creacion_lab = "", usuario_id = "";

            while (rs.next()) {
                id_laboratorio = rs.getString(1);
                nombre_laboratorio = rs.getString(2);
                f_creacion_lab = rs.getString(3);
                usuario_id = rs.getString(4);

                Laboratorio new_lab = new Laboratorio(id_laboratorio, nombre_laboratorio, f_creacion_lab, usuario_id);

                laboratorios.add(new_lab);
            }

            pst.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Error en ObtenerDatos " + e.getMessage());
        }
        return laboratorios;
    }
}
