/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacolas;

import javax.swing.JOptionPane;

/**
 *
 * @author Santiago
 */
public class JavaColas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion=0,elemento=0;
        jCCola colita=new jCCola();
        do{
            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                         "1. Insertar un elemento a la Cola\n"
                                 + "2. Quitar elemento de la cola\n"
                                 + "3. ¿La cola está vacía?\n"
                                 + "4. Elemento ubicado en el Inicio de la Cola\n"
                                 + "5. Tamaño de la Cola\n"
                                 + "6. Salir","Menu de Opciones de una Cola\n"
                                 ,JOptionPane.QUESTION_MESSAGE));
                switch(opcion){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese el elemento a insertar","Insertando a la Cola"
                                ,JOptionPane.QUESTION_MESSAGE));
                        colita.insertar(elemento);
                        break;
                    case 2:
                        if (!colita.estVacia()) {
                            JOptionPane.showMessageDialog(null, "El elemento atendido es "+ colita.quitar(),
                                    "Quitando elemento de la cola",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "La cola esta vacia ",
                                    "Cola Vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if (colita.estVacia()) {
                            JOptionPane.showMessageDialog(null, "La cola esta vacia ",
                                    "Cola Vacia",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "La cola No     esta vacia ",
                                    "Cola No Vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (!colita.estVacia()) {
                            JOptionPane.showMessageDialog(null, "El elemento ubicado al inicio de la Cola es "+ colita.inicioCola(),
                                    "Cola Vacia",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "La cola esta vacia ",
                                    "Cola Vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "El tamaño de la cola es "+ colita.tamanioCola(),
                                    "Cola Vacia",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Aplicacion Finalizada",
                                    "Fin",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default: JOptionPane.showMessageDialog(null, "Opcion Incorrecta",
                                    "¡Cuidado!",JOptionPane.INFORMATION_MESSAGE);
                    
                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
            }
        }while(opcion!=6);
    }
    
}
