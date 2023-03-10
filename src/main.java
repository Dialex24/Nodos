
import controladores.PacienteController;
import modelos.Lista;
import vistas.frmListaPacientes;
import vistas.frmPacientes;
import vistas.frmPrincipal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umg
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmPacientes VistaPacientes = new frmPacientes(VistaPrincipal,true);
        frmListaPacientes VistaLista = new frmListaPacientes(VistaPrincipal, true);
        Lista NuevaLista = new Lista();
        
        //levatnar el controlador
        PacienteController NuevoControlador = new PacienteController(VistaPrincipal, VistaPacientes, VistaLista, NuevaLista);
    }
    
}
