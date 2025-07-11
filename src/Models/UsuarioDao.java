package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


// DAO Data Access Object
public class UsuarioDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public Usuario login(String alias, String contraseña) {
        String sql = "SELECT * FROM USUARIOS WHERE ALIAS=? AND CONTRASEÑA=?";
        Usuario usuario = new Usuario();
        try {
            Conexion.conectarBBDD();
            con = cn.getConexion();

            ps = con.prepareStatement(sql);
            ps.setString(1, alias);
            ps.setString(2, contraseña);
            rs = ps.executeQuery();
            if (rs.next()) {
                usuario.setId(rs.getInt("id"));
                usuario.setAlias(rs.getString("alias"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setContraseña(rs.getString("contraseña"));
                usuario.setRol(rs.getString("rol"));
                usuario.setEstado(rs.getString("estado"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return usuario;
    }

    public boolean registrar(Usuario usuario) {
        String sql = "INSERT INTO USUARIOS (alias, nombre, contraseña, caja, rol) VALUES (?,?,?,?,?)";

        try {
            Conexion.conectarBBDD();
            con = cn.getConexion();

            ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getAlias());
            ps.setString(2, usuario.getNombre());
            ps.setString(3, usuario.getContraseña());
            ps.setString(4, usuario.getCaja());
            ps.setString(5, usuario.getRol());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
}
