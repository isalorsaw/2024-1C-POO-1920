/*
   Pedir y Validar 5 numeros enteros y mostrar cuantos fueron
   neutros, pos y neg
   */
  import javax.swing.JOptionPane;
  public class CicloDWTC
  {
      public static void main(String args[])
      {
          int numero=0;
          int pos=0;
          int neg=0;
          int neu=0;
          
          int i=0;
          
          while(i<5)
          {//Inicio de While ciclo para pedir 5 numeros
              boolean seguir=true;
              do
              {
                  try
                  {
                      String entrada=JOptionPane.showInputDialog("Ingrese un Numero Entero");
                      numero=Integer.parseInt(entrada);
                      seguir=false;
                      
                      if(numero==0)neu++;
                      else if(numero>0)pos++;
                      else neg++;
                  }
                  catch(Exception exp)
                  {
                      JOptionPane.showMessageDialog(null,"Numero Invalido");
                  }
              }while(seguir==true);              
              i++;
          }//Fin del While
          JOptionPane.showMessageDialog(null,"Positivo "+pos+"\nNegativo "+neg+"\nNeutros "+neu);
      }
  }