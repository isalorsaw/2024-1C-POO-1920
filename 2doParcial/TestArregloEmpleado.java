/*
Menu
1. Agregar un Empleado. Evitar Duplicar dos cedulas iguales.
2. Buscar un Empleado Pedir Cedula y Mostrarlo
3. Ver Todos los Empleados.
   */
import javax.swing.JOptionPane;
public class TestArregloEmpleado
{
    public static void main(String args[])
    {
        Empleado emp[]=new Empleado[0];
        boolean seguir=true;
        int op=0;
        do
        {
            op=ClaseFM.pedirEntero("Menu\n1.Agregar Empleado\n2.Buscar Empleado\n"+
            "3.Ver Todos los Empleados\n0.Salir");
            if(op==0)seguir=false;
            else if(op==1)emp=agregarEmpleado(emp);
            else if(op==3)imprimirEmpleados(emp);
        }while(seguir);
    }
    public static void imprimirEmpleados(Empleado e[])
    {
        String cadena="Informacion de Empleados\n";
        int i=0;
        while(i<e.length)
        {
            cadena+=e[i].toString()+"\n-------------------\n";
            i++;
        }
        ClaseFM.mensaje(cadena);
    }
    public static Empleado[] agregarEmpleado(Empleado e[])
    {
        String ced=ClaseFM.pedirCadena("Ingrese una Cedula");
        
        boolean siexiste=buscarCedula(e,ced);
        
        if(siexiste==true)ClaseFM.mensaje("La Cedula Ya Existe");
        else
        {
            Empleado nuevo=new Empleado(ced);
            e=agregar(e,nuevo);
        }
        return e;
    }
    public static boolean buscarCedula(Empleado e[], String ced)
    {
        for(int i=0;i<e.length;i++)
        {
            if(e[i].getCedula().equalsIgnoreCase(ced))//String.equals(String) COMPARANDO CADENAS
            return true;
        }
        return false;
    }
    public static Empleado[] agregar(Empleado e[], Empleado n)//Aumenta el Arreglo-Redefinir
    {
        Empleado tmp[]=new Empleado[e.length+1];
        for(int i=0;i<e.length;i++)
        {
            tmp[i]=e[i];
        }
        tmp[e.length]=n;
        return tmp;
    }
}