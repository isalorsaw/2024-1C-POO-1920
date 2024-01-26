/*
   Ingrese 5 numeros y mostrar cuantos fueron negativos, positivos y ceros.
   Utilizando el Ciclo While (Mientras)
   */
  import javax.swing.JOptionPane;
  public class EjemploWhile
  {
      public static void main(String args[])
      {
          int numero=0,neg=0,pos=0,cero=0;
          //int numero=0;//Variable del numero a ingresar
          //int neg=0;//contadores
          //int pos=0;//contadores
          //int cero=0;//contadores
          
            int i=0;//Desde donde comienzo
            while(i<5)//Hasta donde voy a llegar
            {
                //String entrada=JOptionPane.showInputDialog("Ingrese un Numero");
                //numero=Integer.parseInt(entrada);
                
                numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Numero"));
          
                  if(numero==0)//Comparar Dos Iguales y para Inicializar 1 igual.
                  {
                      cero=cero+1;
                      //cero++;
                  }
                  else if(numero>0)
                  {
                      pos=pos+1;
                      //pos++;
                  }
                  else
                  {
                      neg=neg+1;
                      //neg++;
                  }
                i++;//Como voy a avanzar
                //i=i+1;
            }
          String salida="Positivos "+pos+" Negativos "+neg+" Neutros "+cero;
          JOptionPane.showMessageDialog(null,salida);
            /**/
      }
  }
