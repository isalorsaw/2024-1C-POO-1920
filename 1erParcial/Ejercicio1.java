/*
 * Clase POO 7:20pm
 * Elaborado por Ing Isaias Salinas
 * Ingresar 2 numeros enteros y mostrar la suma de ellos   
*/
import javax.swing.JOptionPane;
public class Ejercicio1
{//Inicio class
    public static void main(String args[])
    {//Inicio main
        //Declarar e inicializar variables
        int n1=0;
        int n2=0;
        int suma=0;
        
        //Entrada de primer numero
        String entrada=JOptionPane.showInputDialog("Ingrese el Primer Numero");
        n1=Integer.parseInt(entrada);
        
        //Entrada de segundo numero
        entrada=JOptionPane.showInputDialog("Ingrese el Segundo Numero");
        n2=Integer.parseInt(entrada);
        
        suma=n1+n2;
        
        //Explicacion la prox clase
        //Salida
        JOptionPane.showMessageDialog(null,"La Suma es: "+suma);
        
    }//Fin main
}//Fin class