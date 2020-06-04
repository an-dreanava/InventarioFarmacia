/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author drean
 */
import conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Types;
import modelo.Usuario;

public class UsuarioDAO {

    Statement stm;
    CallableStatement cst;
    PreparedStatement pst;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection conn;
    String sql = "";

    public Usuario ValidarUsuario(String usuario_id) {
        boolean estado = false;
        Usuario usuario = null;

        sql = "{call SP_VALIDAR_USUARIO (?,?,?)}";
        try {
            conn = c.getConnection();
            cst = conn.prepareCall(sql);
            cst.setString(1, usuario_id);
            cst.registerOutParameter(1, Types.VARCHAR);
            cst.registerOutParameter(2, Types.VARCHAR);
            cst.registerOutParameter(3, Types.VARCHAR);
            rs = cst.executeQuery();

            String nombre_usuario = "", tipo_usuario = "";

            usuario_id = cst.getString(1);
            nombre_usuario = cst.getString(2);
            tipo_usuario = cst.getString(3);
            rs.close();
            conn.close();
            estado = true;

            usuario = new Usuario(usuario_id, nombre_usuario, tipo_usuario);

            System.out.println(">>>USUARIO:" + usuario + ">>>>>ESTADO" + estado);
        } catch (SQLException e) {
            System.out.println("Error en validar usuario " + e.getMessage());
        }
        return usuario;
    }

}
