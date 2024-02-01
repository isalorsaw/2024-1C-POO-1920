import javax.swing.JOptionPane;
public class EjemploArreglo
{
    public static void main(String args[])
    {
        int tam=ClaseFM.pedirEntero("Ingrese el Tamaño del Arreglo");
        int arreglo[]=new int[tam];//Creando un arreglo de enteros de tamaño 5
        
        //Llamando a un metodo que pida los numeros al usuario y llegarlos en el arreglo
        ClaseFM.llenarArreglo(arreglo);
        
        String salida=ClaseFM.imprimir(arreglo);
        ClaseFM.mensaje(salida);
        
        int arreglo2[]=new int[4];
        ClaseFM.print(arreglo2);
        
        //JOptionPane.showMessageDialog(null,arreglo);
        
        Object obj[]=new Object[10];
        int n=9;
        double d[]=new double[10];
        
        int num=-1;
        ClaseFM.mensaje(""+num);
    }
}