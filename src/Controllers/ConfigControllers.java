package Controllers;

import Views.FrmAdmin;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ConfigControllers implements MouseListener{
    
    private FrmAdmin frmAdmin;

    public ConfigControllers(FrmAdmin frmAdmin) {
        this.frmAdmin = frmAdmin;
        this.frmAdmin.jLabel_Categorias.addMouseListener(this);
    }
    
    

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
}
