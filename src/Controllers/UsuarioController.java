package Controllers;

import Models.Usuario;
import Models.UsuarioDAO;
import Views.FrmAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class UsuarioController implements ActionListener {

    private Usuario usuario;
    private UsuarioDAO usuarioDao;
    private FrmAdmin frmAdmin;

    public UsuarioController(Usuario usuario, UsuarioDAO usuarioDao, FrmAdmin frmAdmin) {
        this.usuario = usuario;
        this.usuarioDao = usuarioDao;
        this.frmAdmin = frmAdmin;
        this.frmAdmin.btn_NuevoUsuario_Registrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.frmAdmin.btn_NuevoUsuario_Registrar) {
            if (this.frmAdmin.txt_NuevoUsuario_Alias.getText().equals("")
                    || this.frmAdmin.txt_NuevoUsuario_Nombre.getText().equals("")
                    || String.valueOf(this.frmAdmin.jPassword_NuevoUsuario_Contraseña.getPassword()).equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son Obligtorios");
            } else {
                usuario.setAlias(this.frmAdmin.txt_NuevoUsuario_Alias.getText());
                usuario.setNombre(this.frmAdmin.txt_NuevoUsuario_Nombre.getText());
                usuario.setContraseña(String.valueOf(this.frmAdmin.jPassword_NuevoUsuario_Contraseña.getPassword()));
                usuario.setCaja(this.frmAdmin.jComboBox_NuevoUsuario_Caja.getSelectedItem().toString());
                usuario.setRol(this.frmAdmin.jComboBox_NuevoUsuario_Rol.getSelectedItem().toString());
            
                if(usuarioDao.registrar(usuario)){
                    JOptionPane.showMessageDialog(null, "Usuario registrado correctamente");
                }else{
                    JOptionPane.showMessageDialog(null, "ERROR al registrar el Usuario");
                }
                
            }
        }

    }

}
