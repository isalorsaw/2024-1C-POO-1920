/*
   Ingrese su nombre y su edad y mostrar una concatenacion del Nombre y de la edad.
   */
  import javax.swing.JOptionPane;
  public class Cadena
  {//Inicio del Class
      public static void main(String args[])
      {//Inicio del Main
          
          int edad=0;
          String nombre="";
          String apellido="";
          
          //Ingresamos una Cadena
          nombre=JOptionPane.showInputDialog("Ingrese su Nombre");
          
          apellido=JOptionPane.showInputDialog("Ingrese su Apellido");
          
          //Ingresamos un entero
          String entrada=JOptionPane.showInputDialog("Ingrese su Edad");
          edad=Integer.parseInt(entrada);
          
          //Salida
          String salida="Su nombre es\n"+nombre+" "+apellido+"\nTiene "+edad+" años";
          
          //If si es mayor o menor de edad
          if(edad>=18)
          {
              salida=salida+" Mayor de Edad";
          }
          else
          {
              salida=salida+" Menor de Edad";
          }
          
          JOptionPane.showMessageDialog(null,salida);
          
      }//Fin del Main
  }//Fin del Class