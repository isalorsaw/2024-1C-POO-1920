public class TestEmpleado3
{
    public static void main(String args[])
    {
        Empleado e=new Empleado();//Instanciando un Objeto o Clase que se llama Empleado
    
        String ced=ClaseFM.pedirCadena("Ingrese la Cedula del Empleado");
        String nom=ClaseFM.pedirCadena("Ingrese el Nombre del Empleado");
        int edad=ClaseFM.pedirEntero("Ingrese la Edad");
        String pue=ClaseFM.pedirCadena("Ingrese el Puesto del Empleado");
        String dir=ClaseFM.pedirCadena("Ingrese la direccion del Empleado");
        
        e=new Empleado(ced,nom,pue,dir,edad);
        ClaseFM.mensaje(e.toString());
        
    }
}