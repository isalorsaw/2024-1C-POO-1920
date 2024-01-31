/*
 * Introduccion:
 * Funciones
 * Metodos
 * Arreglos
 * Introd Clases o Objetos.
Ingrese dos enteros y mostrar la suma   
*/
import javax.swing.JOptionPane;
public class EjemploFM
{
    //Variables Globales
    //public static int numero=0;
    public static void main(String args[])
    {
        int n1=ClaseFM.pedirEntero("Ingrese el Primer Numero");//Llamando a una funcion
        int n2=ClaseFM.pedirEntero("Ingrese el Segundo Numero");
        //int menu=pedirEntero("Menu\n1.Sumas\n2.Restar\n3.Dividir\n4.Salir");
        int suma=n1+n2;
        ClaseFM.mensaje("La Suma es: "+suma);//Metodo
    }
}