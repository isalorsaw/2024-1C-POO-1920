/*
 * Ingresar dos notas y mostrar Aprobado si el promedio
 * es mayor o igual a 70 sino Reprobado
*/
import javax.swing.JOptionPane;
public class Ejercicio2
{//Inicio Class
    public static void main(String args[])
    {//Inicio Main
        
        int nota1=0;
        int nota2=0;
        double promedio=0;
        
        String entrada=JOptionPane.showInputDialog("Ingrese la Primera Nota");
        nota1=Integer.parseInt(entrada);
        
        //Otra manera de pedir Nota1
        //nota1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Primera Nota"));
        
        entrada=JOptionPane.showInputDialog("Ingrese la Segunda Nota");
        nota2=Integer.parseInt(entrada);
        
        promedio=(nota1+nota2)/2;
        
        //Estructuras Control If, Else if y Else
        if(promedio>=70)
        {
            //JOptionPane.showMessageDialog(null,"Su Promedio es "+promedio+"\nAprobado","Titulo",2);   
            JOptionPane.showMessageDialog(null,"Su Promedio es "+promedio+"\nAprobado");   
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Su Promedio es "+promedio+"\nReprobado");
        }
        
        
    }//Fin Main
}//Fin Class