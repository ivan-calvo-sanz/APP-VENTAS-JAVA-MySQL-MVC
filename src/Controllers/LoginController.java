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
        if (e.getSource() == frmLogin.btnLogin) {
            if (frmLogin.txtAlias.getText().equals("") || String.valueOf(frmLogin.txtContraseña.getPassword()).equals("")) {
                JOptionPane.showMessageDialog(null, "Los campos están vacios");
            } else {
                String alias = frmLogin.txtAlias.getText();
                String contraseña = String.valueOf(frmLogin.txtContraseña.getPassword());
                usuario = usuarioDao.login(alias, contraseña);
                if (usuario.getAlias() != null) {
                    FrmAdmin frmAdmin = new FrmAdmin();
                    frmAdmin.setVisible(true);
                    this.frmLogin.dispose();
                }else{
                    System.out.println("Usuario introducido NO existe");
                }

            }
        } else {

        }
    }

}
