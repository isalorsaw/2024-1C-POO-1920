import javax.swing.JOptionPane;
public class ClaseFM
{
    //Metodo que llena un arreglo pidiendoselo al usuario
    public static void llenarArreglo(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            int p=i+1;
            a[i]=pedirEntero("Ingrese el Numero #"+p);
        }
    }
    //Funcion que recibe un arreglo y lo retorna en una Cadena
    public static String imprimir(int a[])
    {
        String salida="Informacion del Arreglo\n";
        int i=0;
        while(i<a.length)
        {
            salida+=a[i]+" ";//Cada valor del arreglo se concatena en la cadena Salida
            //salida=salida+a[i]+" ";
            //salida=a[i]+" ";
            i++;
        }
        return salida;
    }
    //Metodo que recibe un arreglo y lo retorna en una Cadena
    public static void print(int a[])
    {
        String salida="Informacion del Arreglo\n";
        int i=0;
        while(i<a.length)
        {
            salida+=a[i]+" ";//Cada valor del arreglo se concatena en la cadena Salida
            //salida=salida+a[i]+" ";
            //salida=a[i]+" ";
            i++;
        }
        mensaje(salida);
    }
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