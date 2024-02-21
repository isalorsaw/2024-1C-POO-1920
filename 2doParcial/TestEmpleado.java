import javax.swing.JOptionPane;
public class TestEmpleado
{
    public static void main(String args[])
    {
        Empleado emp=new Empleado();
        
        String cedula=ClaseFM.pedirCadena("Ingrese una Cedula");
        String nombre=ClaseFM.pedirCadena("Ingrese unNombre ");
        String puesto=ClaseFM.pedirCadena("Ingrese el puesto");
        String direccion=ClaseFM.pedirCadena("Ingrese una Direccion");
        
        emp=new Empleado(cedula,nombre,puesto,direccion);
        
        JOptionPane.showMessageDialog(null,emp.toString());

        //int e=0;
    }
}