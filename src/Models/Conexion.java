package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static Connection miConexion;
    final static String SERVIDOR = "localhost";
    final static int PUERTO = 3306;
    final static String BASE_DATOS = "posventa_mvc";
    final static String USUARIO = "root";
    final static String CLAVE = "";



    /**
     * 01-Conectar a BBDD
     */
    public static void conectarBBDD() {
        //System.out.println("aqui para");
        try {
            //Conexion mysql
            //miConexion = DriverManager.getConnection("jdbc:mysql://" + SERVIDOR + ":" + PUERTO + "/" + BASE_DATOS + "?" + "user=" + USUARIO + "&password=" + CLAVE);
            //Conexion mariadb
            miConexion = DriverManager.getConnection("jdbc:mariadb://" + SERVIDOR + ":" + PUERTO + "/" + BASE_DATOS + "?" + "user=" + USUARIO + "&password=" + CLAVE);
            System.out.println("Conexion correcta a la BBDD");
        } catch (SQLException ex) {
            System.err.println("Se ha producido un problema en la conexión. [Codigo]:" + ex.getErrorCode() + " [Error]:" + ex.getMessage());
        }
    }

    /**
     * FUNCION devuelve la conexion
     */
    public Connection getConexion() {
        return miConexion;
    }

}
