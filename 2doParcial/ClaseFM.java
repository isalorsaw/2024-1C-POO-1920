import javax.swing.JOptionPane;
public class ClaseFM
{
    public static String pedirCadena(String msg)
    {
        String c="";
        boolean seguir=true;
        
        do
        {
            try
            {
                c=JOptionPane.showInputDialog(msg);
                if(c.length()>0)seguir=false;
            }catch(Exception exp)
            {
                
            }
        }while(seguir);
        return c;
    }
    public static void mensaje(String msg)
    {
        JOptionPane.showMessageDialog(null,msg);
    }
    public static int pedirEntero(String msg)
    {
        int n=0;
        boolean seguir=true;
        
        do
        {
            try
            {
                n=Integer.parseInt(JOptionPane.showInputDialog(msg));
                seguir=false;
            }catch(Exception exp)
            {
                
            }
        }while(seguir);
        return n;
    }
}