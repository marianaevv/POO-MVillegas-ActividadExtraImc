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
public class CalculadoraImc {
    private String nombre;
   private double estatura,peso, imc;

    public CalculadoraImc(String nombre, double estatura, double peso) {
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
        this.imc = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    public double getPeso() {
        return peso;
    }

    public double getImc() {
        return imc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setImc(double peso, double estatura) {
        this.imc = this.peso/(this.estatura*this.estatura);
    }

    public void getDiagnostico(double imc){
        
        if(imc <16.00) JOptionPane.showMessageDialog(null, "Infrapeso: Delgadez Severa");
        if(imc >=16.00 && imc <=16.99) JOptionPane.showMessageDialog(null, "Infrapeso: Delgadez moderada");
        if (imc >=17.00 && imc <=18.49) JOptionPane.showMessageDialog(null, "Infrapeso: Delgadez Aceptable");
        if (imc >=18.50 && imc <=24.99) JOptionPane.showMessageDialog(null, "Peso Normal");
        if (imc >=25.00 && imc <=29.99) JOptionPane.showMessageDialog(null, "Sobrepeso");
        if (imc >=30.00 && imc <=34.99) JOptionPane.showMessageDialog(null, "Obeso: Tipo I");
        if (imc >=35.00 && imc <=40.00) JOptionPane.showMessageDialog(null, "Obeso: Tipo II");
        if (imc>40.00) JOptionPane.showMessageDialog(null, "Obeso: Tipo III");
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", estatura=" + estatura + ", peso=" + peso + ", imc=" + imc + '}';
    }
   
    
}
