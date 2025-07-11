package Controllers;

import Views.FrmAdmin;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ConfigController implements MouseListener {

    private FrmAdmin frmAdmin;

    public ConfigController(FrmAdmin frmAdmin) {
        this.frmAdmin = frmAdmin;
        this.frmAdmin.jLabel_NuevaVenta.addMouseListener(this);
        this.frmAdmin.jLabel_NuevaCompra.addMouseListener(this);
        this.frmAdmin.jLabel_Productos.addMouseListener(this);
        this.frmAdmin.jLabel_Clientes.addMouseListener(this);
        this.frmAdmin.jLabel_Proveedor.addMouseListener(this);
        this.frmAdmin.jLabel_Medidas.addMouseListener(this);
        this.frmAdmin.jLabel_Categorias.addMouseListener(this);
        this.frmAdmin.jLabel_Configuracion.addMouseListener(this);
        this.frmAdmin.jLabel_Usuaio.addMouseListener(this);
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
        // ACCIONES CUANDO EL MOUSE ENTRA DENTRO DEL ELEMENTO
        // Cambiar el fondo de los jPanel al salir el raton de los jLabel
        if (e.getSource() == frmAdmin.jLabel_NuevaVenta) {
            frmAdmin.jPanel_NuevaVenta.setBackground(new Color(255, 51, 51));
        } else if (e.getSource() == frmAdmin.jLabel_NuevaCompra) {
            frmAdmin.jPanel_NuevaCompra.setBackground(new Color(255, 51, 51));
        } else if (e.getSource() == frmAdmin.jLabel_Productos) {
            frmAdmin.jPanel_Productos.setBackground(new Color(255, 51, 51));
        } else if (e.getSource() == frmAdmin.jLabel_Clientes) {
            frmAdmin.jPanel_Clientes.setBackground(new Color(255, 51, 51));
        } else if (e.getSource() == frmAdmin.jLabel_Proveedor) {
            frmAdmin.jPanel_Proveedor.setBackground(new Color(255, 51, 51));
        } else if (e.getSource() == frmAdmin.jLabel_Medidas) {
            frmAdmin.jPanel_Medidas.setBackground(new Color(255, 51, 51));
        } else if (e.getSource() == frmAdmin.jLabel_Categorias) {
            frmAdmin.jPanel_Categorias.setBackground(new Color(255, 51, 51));
        } else if (e.getSource() == frmAdmin.jLabel_Configuracion) {
            frmAdmin.jPanel_Configuracion.setBackground(new Color(255, 51, 51));
        } else if (e.getSource() == frmAdmin.jLabel_Usuaio) {
            frmAdmin.jPanel_Usuarios.setBackground(new Color(255, 51, 51));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // ACCIONES CUANDO EL MOUSE SALE DEL ELEMENTO
        // Cambiar el fondo de los jPanel al salir el raton de los jLabel
        if (e.getSource() == frmAdmin.jLabel_NuevaVenta) {
            frmAdmin.jPanel_NuevaVenta.setBackground(new Color(102, 102, 102));
        } else if (e.getSource() == frmAdmin.jLabel_NuevaCompra) {
            frmAdmin.jPanel_NuevaCompra.setBackground(new Color(102, 102, 102));
        } else if (e.getSource() == frmAdmin.jLabel_Productos) {
            frmAdmin.jPanel_Productos.setBackground(new Color(102, 102, 102));
        } else if (e.getSource() == frmAdmin.jLabel_Clientes) {
            frmAdmin.jPanel_Clientes.setBackground(new Color(102, 102, 102));
        } else if (e.getSource() == frmAdmin.jLabel_Proveedor) {
            frmAdmin.jPanel_Proveedor.setBackground(new Color(102, 102, 102));
        } else if (e.getSource() == frmAdmin.jLabel_Medidas) {
            frmAdmin.jPanel_Medidas.setBackground(new Color(102, 102, 102));
        } else if (e.getSource() == frmAdmin.jLabel_Categorias) {
            frmAdmin.jPanel_Categorias.setBackground(new Color(102, 102, 102));
        } else if (e.getSource() == frmAdmin.jLabel_Configuracion) {
            frmAdmin.jPanel_Configuracion.setBackground(new Color(102, 102, 102));
        } else if (e.getSource() == frmAdmin.jLabel_Usuaio) {
            frmAdmin.jPanel_Usuarios.setBackground(new Color(102, 102, 102));
        }
    }

}
