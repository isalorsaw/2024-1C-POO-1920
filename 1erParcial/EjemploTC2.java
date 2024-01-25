import javax.swing.JOptionPane;
public class EjemploTC2
{
    public static void main(String args[])
    {
        double numero=0; //Decimal
        
        try
        {
            String entrada=JOptionPane.showInputDialog("Ingresar un Numero");
            numero=Double.parseDouble(entrada);
            JOptionPane.showMessageDialog(null,"El Numero ingresado es "+numero);
        }catch(Exception exp)
        {
            JOptionPane.showMessageDialog(null,"Decimal Invalido");
        }
        
    }
}