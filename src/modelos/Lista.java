/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import javax.swing.JOptionPane;

/**
 *
 * @author umg
 */
public class Lista {
Paciente siguiente;
Paciente primero;
Paciente Auxiliar;
String cadena = "";

public void Apilar()
{
    
}
public void Agregar(String apellido, String nombre)
{
    Paciente nuevoPaciente = new Paciente(apellido, nombre );
    if(primero == null)
    {
        primero = nuevoPaciente;
    }
    else 
    {
        nuevoPaciente.siguiente = primero;
        primero = nuevoPaciente;
    }
    JOptionPane.showMessageDialog(null, "Paciente Agregado");
}

public String Listar()
{
 Auxiliar = primero;
 cadena = "";
 while(Auxiliar != null)
 {
     
     cadena = " " + Auxiliar.getApellido() + " " + Auxiliar.getNombre()+ "\n" + cadena;
     Auxiliar = Auxiliar.siguiente;
     
 }
 return cadena;
}


}
