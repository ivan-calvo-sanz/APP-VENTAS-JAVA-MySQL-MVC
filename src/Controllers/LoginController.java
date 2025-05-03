package Controllers;

import Models.Usuario;
import Models.UsuarioDao;
import Views.FrmAdmin;
import Views.FrmLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class LoginController implements ActionListener {

    private Usuario usuario;
    private UsuarioDao usuarioDao;
    private FrmLogin frmLogin;

    public LoginController(Usuario usuario, UsuarioDao usuarioDao, FrmLogin frmLogin) {
        this.usuario = usuario;
        this.usuarioDao = usuarioDao;
        this.frmLogin = frmLogin;
        this.frmLogin.btnLogin.addActionListener(this);
        this.frmLogin.btnCancelar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // ACCION DEL BOTON "LOGIN"
        if (e.getSource() == frmLogin.btnLogin) {
            if (frmLogin.txt_Alias.getText().equals("") || String.valueOf(frmLogin.txt_Contraseña.getPassword()).equals("")) {
                JOptionPane.showMessageDialog(null, "Los campos están vacios");
            } else {
                String alias = frmLogin.txt_Alias.getText();
                String contraseña = String.valueOf(frmLogin.txt_Contraseña.getPassword());
                usuario = usuarioDao.login(alias, contraseña);
                if (usuario.getAlias() != null) {
                    FrmAdmin frmAdmin = new FrmAdmin();
                    frmAdmin.setVisible(true);
                    this.frmLogin.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
                }

            }
            // ACCION DEL BOTON "CANCELAR"
        } else {
            int pregunta = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea salir?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
// Si el Usuario pulsa "SI" devuelve int "0", slimos del programa
            if (pregunta == 0) {
                System.exit(0);
            }
        }
    }

}
