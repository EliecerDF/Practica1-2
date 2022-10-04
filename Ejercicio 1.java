/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaclase02;

import javax.swing.JOptionPane;

/**
 *
 * @author steve
 */
public class PracticaClase02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Byte antiguedad= 0;
        Byte horasSemana= 0;
        Byte pagoHora= 0;
        Integer salarioBruto= 0;
        double salarioBono = 0;
        
        antiguedad = Byte.parseByte(JOptionPane.showInputDialog(""
                + "Ingrese años de antiguedad: "));
        horasSemana = Byte.parseByte(JOptionPane.showInputDialog(""
                + "Ingrese horas laboradas por semana: "));
        pagoHora = Byte.parseByte(JOptionPane.showInputDialog(""
                + "Pago por hora: "));
        salarioBruto= horasSemana * pagoHora;
        
        if(antiguedad>10){
            salarioBono = salarioBruto + (salarioBruto * 0.2);
            if(salarioBono>1000){
               salarioBono -= salarioBono * 0.1;
            } else if(salarioBono>2000){
                salarioBono -= salarioBono * 0.15;
            }
            JOptionPane.showInternalMessageDialog(null, "Su "
                    + "salario con bono es: " + salarioBono);
            
        } else {
            JOptionPane.showInternalMessageDialog(null, "Su "
                    + "salario neto es: " + salarioBono);
        }
        
        
    }
    
}
