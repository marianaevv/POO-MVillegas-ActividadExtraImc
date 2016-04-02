/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooactividadimc;

import javax.swing.JOptionPane;
/**
 *
 * @author Mariana Villegas
 */
public class POOActividadImc {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        String nombre;
        Double peso,estatura;
        
        nombre = JOptionPane.showInputDialog("Nombre: ");
        peso = Double.parseDouble(JOptionPane.showInputDialog("Peso en kgs: "));
        estatura = Double.parseDouble(JOptionPane.showInputDialog("Estatura en mts: "));
        
        CalculadoraImc persona = new CalculadoraImc(nombre,estatura,peso);
        persona.setImc(peso,estatura);
        
        JOptionPane.showMessageDialog(null,persona.toString());
        persona.getDiagnostico(persona.getImc());
   }
}

   