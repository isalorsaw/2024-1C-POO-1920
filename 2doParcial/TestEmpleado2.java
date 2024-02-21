public class TestEmpleado2
{
    public static void main(String args[])
    {
        Empleado e=new Empleado();//Instanciando un Objeto o Clase que se llama Empleado
        
        ClaseFM.mensaje(e.toString());
        
        
        //e.setCedula("1102199000890");//set=inicializar atributo=asignar
        //e.setNombre("Isaias");//set
        //e.setEdad(39);
        
        
        String ced=ClaseFM.pedirCadena("Ingrese la Cedula del Empleado");
        String nom=ClaseFM.pedirCadena("Ingrese el Nombre del Empleado");
        int edad=ClaseFM.pedirEntero("Ingrese la Edad");
        e.setCedula(ced);
        e.setNombre(nom);
        e.setEdad(edad);
        
        String tc="";
        if(e.esTerceraEdad()==true)tc="Es Tercera Edad";//Funcion
        else tc="No es Tercera Edad";
        
        
        ClaseFM.mensaje(e.toString());
        ClaseFM.mensaje(tc);
        //ClaseFM.mensaje(e.getCedula());//get=retorna=muestra
        //ClaseFM.mensaje(e.getNombre());//get
    }
}