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

    public Usuario ValidarUsuario(String usuario_id,String usuario_clave) {
        boolean estado = false;
        Usuario usuario=null;

        sql = "{call SP_VALIDAR_USUARIO (?,?,?,?)}";
        try {
            conn = c.getConnection();
            cst = conn.prepareCall(sql);
            cst.setString(1, usuario_id);
            cst.setString(2, usuario_clave);
            cst.registerOutParameter(1, Types.VARCHAR);
            cst.registerOutParameter(2, Types.VARCHAR);
            cst.registerOutParameter(3, Types.VARCHAR);
            cst.registerOutParameter(4, Types.VARCHAR);
            rs = cst.executeQuery();

            String nombre_usuario = "", tipo_usuario = "";

            usuario_id = cst.getString(1);
            usuario_clave = cst.getString(2);
            nombre_usuario = cst.getString(3);
            tipo_usuario = cst.getString(4);
            rs.close();
            conn.close();
            estado = true;

            usuario = new Usuario(usuario_id,usuario_clave, nombre_usuario, tipo_usuario);

            System.out.println(">>>USUARIO:" + usuario +">>>clave:"+usuario_clave +">>>>>ESTADO" + estado);
        } catch (SQLException e) {
            System.out.println("Error en validar usuario " + e.getMessage());
        }
        return usuario;
    }

}
