/*
 * Introduccion:
 * Funciones
 * Metodos
 * Arreglos
 * Introd Clases o Objetos.
Ingrese dos enteros y mostrar la suma   
*/
import javax.swing.JOptionPane;
public class EjemploFM2
{
    //Variables Globales
    //public static int numero=0;
    public static void main(String args[])
    {
        String nombre=ClaseFM.pedirCadena("Ingrese un Nombre");
        int edad=ClaseFM.pedirEntero("Ingrese su Edad");
        ClaseFM.mensaje(nombre+" tiene "+edad+" años");
    }
}