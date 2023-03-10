/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelos.Lista;
import vistas.frmListaPacientes;
import vistas.frmPacientes;
import vistas.frmPrincipal;

/**
 *
 * @author umg
 */
public class PacienteController implements ActionListener {
    
    //levantar formulario principal 
    frmPrincipal VistaPrincipal;
    frmPacientes VistaPacientes;
    frmListaPacientes VistaLista;
    Lista nuevaLista;

    public PacienteController(frmPrincipal VistaPrincipal, frmPacientes VistaPacientes, frmListaPacientes VistaLista, Lista nuevaLista) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaPacientes = VistaPacientes;
        this.VistaLista = VistaLista;
        this.nuevaLista = nuevaLista;
        
        //poner a la escucha los botones
        this.VistaPrincipal.btnAgregarPaciente.addActionListener(this);
        this.VistaPrincipal.btnLista.addActionListener(this);
        
        
        //levantar vista principal
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource() == this.VistaPrincipal.btnAgregarPaciente)    
    {
        //abrir la vista nodos
        //poner a la escucha los botones apilar y encolar
        this.VistaPacientes.btnAgregar.addActionListener(this);
        //levantar el formulario vista nodos
        this.VistaPacientes.setLocationRelativeTo(null);
        this.VistaPacientes.setVisible(true);
    }
    if(e.getSource() == this.VistaPrincipal.btnLista)
    {
        this.VistaPrincipal.btnLista.addActionListener(this);
        this.VistaLista.setLocationRelativeTo(null);
        this.VistaLista.setVisible(true);
    }
    if(e.getSource()==this.VistaPacientes.btnAgregar)
    {
        this.nuevaLista.Agregar(this.VistaPacientes.txtApellido.getText(), 
                this.VistaPacientes.txtNombre.getText());
        this.VistaLista.txtLista.setText(this.nuevaLista.Listar());
    }
    
    }
    
}
