package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static Connection conn = null;
    private static final String login = "DBA_INVENTARIO";
    private static final String clave = "clave_dba";
    private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";

    public Connection getConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url, login, clave);
            conn.setAutoCommit(false);
            if (conn != null) {
                System.out.println("Conexion Exitosa");
            } else {
                System.err.println("Conexion es erronea");
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexion Erronea" +e.getMessage());
        }
        return conn;
    }
    
    public void desconexion(){
    
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println("Error al desconectar " + e.getMessage());
        }
    }
    
    
       
    
    
    
    
    
    
    
}
