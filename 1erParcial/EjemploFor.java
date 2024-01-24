/*
   Ingrese 5 numeros y mostrar cuantos fueron negativos, positivos y ceros.
   Utilizando el Ciclo For (Para)
   */
  import javax.swing.JOptionPane;
  public class EjemploFor
  {
      public static void main(String args[])
      {
           int numero=0,pos=0,neg=0,cero=0;
           
           for(int i=0;i<5;i++)
           {
               String entrada=JOptionPane.showInputDialog("Ingrese un Numero");
               numero=Integer.parseInt(entrada);
               
               if(numero==0)cero++;
               else if(numero>0)pos++;
               else neg++;
           }
           JOptionPane.showMessageDialog(null,"Los Positivos fueron: "+pos+
           "\nLos Negativos fueron: "+neg+"\nY los Neutros fueron: "+cero);
      }
  }