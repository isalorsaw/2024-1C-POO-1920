/*
   Validar la entrada de un entero.
   Si el usuario no ingresar un entero volver a pedirlo.
   */
  import javax.swing.JOptionPane;
  public class EjemploDW
  {
      public static void main(String args[])
      {//INicio del Main
          
          boolean seguir=true;//true false 1,0
          int cont=0;
          int p=0,n=0,c=0,num=0;
          
          do
          {
              String entrada=JOptionPane.showInputDialog("Ingrese un Numero");
              num=Integer.parseInt(entrada);
              cont++;
              
              if(num==0)c++;//cont++ = cont=cont+1;
              else if(num>0)p++;
              else n++;
              
              if(cont==5)seguir=false;
          }while(seguir==true);
          
          JOptionPane.showMessageDialog(null,"+ "+p+" - "+n+" 0 "+c);
    }//Fin de Main
  }