package Aplicacion;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import Dominio.Constantes.EConstantes;

public class App {
    public static void main(String[] args) throws Exception {
        var conversor = new Conversor();
        var opcionConversor = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Conversor", 0,  new ImageIcon(), EConstantes.getOpciones() , EConstantes.getOpciones()[0]);
        var cantidad = JOptionPane.showInputDialog(opcionConversor, "Escriba la cantidad que desee convertir");
        var opcionDivisas = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión de divisas", "Conversor de divisas", 0,  new ImageIcon(), EConstantes.getOpcionesDivisas() , EConstantes.getOpcionesDivisas()[0]);
        var resultado = conversor.ConvertirDivisas(Float.parseFloat(cantidad), 1.07f, 1);
        JOptionPane.showMessageDialog(null, "La conversión es: "+String.valueOf(resultado)+"$", "Resultado", 0);
        System.out.println();
    }
}
