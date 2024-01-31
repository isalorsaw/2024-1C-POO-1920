import javax.swing.JOptionPane;
public class ClaseFM
{
    //Funcion que pida un decimal y lo valide
    public static double pedirDecimal(String msg)
    {
         return 0;   
    }
    //Funcion que reciba 2 numeros y muestre el valor absoluto
    public static int valorAbsoluto(int n, int m)
    {
        return 0;
    }
    //Funcion que valide y pida una cadena. No puede estar vacia
    public static String pedirCadena(String msg)
    {
        return "";
    }
    //Metodo que Recibe una cadena y lo muestra en un panel MessageDialog
    public static void mensaje(String msg)
    {
        JOptionPane.showMessageDialog(null,msg);
    }
    //Funcion que Pide y valida un Entero
    public static int pedirEntero(String msg)
    {
        int numero=0;
        boolean seguir=true;
        
        do
        {
            try
            {
                String e=JOptionPane.showInputDialog(msg);
                numero=Integer.parseInt(e);
                seguir=false;
            }
            catch(Exception exp)
            {
                JOptionPane.showMessageDialog(null,"Error al Ingresar");
            }
        }while(seguir);
        return numero;
    }
}