/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea03;

import javax.swing.JOptionPane;

/**
 *
 * @author steve
 */
public class Tarea03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        boolean flag = true;
        byte opcion = 0;


        while (flag) {
            opcion = Byte.parseByte(JOptionPane.showInputDialog("Práctica03 "
                    + "Menú\n" + "1) Ejercicio01\n" + "2) Ejercicio02\n"
                    + "3) Ejercicio03\n" + "4) Salir"));
            if (opcion == 1) {
                short num1 = 0;
                short num2 = 0;
                boolean op1 = true;
                while (op1) {

                    num1 = Short.parseShort(JOptionPane.showInputDialog(""
                            + "Ingrese número 1"));
                    num2 = Short.parseShort(JOptionPane.showInputDialog(""
                            + "Ingrese número 2"));
                    if (num2 == num1) {
                        op1 = false;
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Número 1 es diferente a número 2");
                    }
                }
                JOptionPane.showMessageDialog(null,
                        "Los números son iguales.");
            }
  
               
            if (opcion == 2) {    
                    short num1 = 0;
                    short num2 = 0;
                    boolean op2 = true;

                    do {
                        num1 = Short.parseShort(JOptionPane.showInputDialog(""
                                + "Ingrese número 1"));
                        num2 = Short.parseShort(JOptionPane.showInputDialog(""
                                + "Ingrese número 2"));
                        if (num2 == num1) {
                            op2 = false;
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Número 1 es diferente a número 2");

                        }

                    } while (op2);
            }
            if (opcion == 3) {    
                    short numero = 0;
                    short suma = 0;
                    short pos = 0;
                    short neg = 0;
                    short i = 0;

                    for (i = 1; i < 11; ++i) {
                        numero = Short.parseShort(JOptionPane.showInputDialog(""
                                + "Ingrese número" + i));
                        suma += numero;
                        if (numero > 0) {
                            ++pos;
                        }
                        if (numero < 0) {
                            ++neg;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "La suma de"
                            + " los números es: " + suma + "\n" + "Números "
                            + "positivos contados: " + pos + "\n" + "Números "
                            + "negativos contados: " + neg);
            }        
                if (opcion == 4) {  
                    flag = false;

            }
        }

    }

}
