import javax.swing.JOptionPane;
public class EjemploTC
{
    public static void main(String args[])
    {
        int numero=0;
        boolean seguir=true;
        
        do
        {
            try
            {
                String entrada=JOptionPane.showInputDialog("Ingresar un Numero");
                numero=Integer.parseInt(entrada);
                JOptionPane.showMessageDialog(null,"El Numero ingresado es "+numero);
                seguir=false;
            }catch(Exception exp)
            {
                JOptionPane.showMessageDialog(null,"Numero Invalido "+exp);
            }
        }while(seguir==true);
        
    }
}