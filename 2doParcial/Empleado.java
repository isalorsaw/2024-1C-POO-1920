import javax.swing.JOptionPane;
public class Empleado
{
    //Atributos
    String cedula;
    String nombre;
    String puesto;
    String direccion;
    int edad;
    //Constructores
    public Empleado()//Vacio No Recibe parametros argumentos
    {
        cedula="";
        nombre="";
        puesto="";
        direccion="";
    }
    public Empleado(String cedula, String nombre, String puesto, String direccion)
    {
        this.cedula=cedula;
        this.nombre=nombre;
        this.puesto=puesto;
        this.direccion=direccion;
    }
    public Empleado(String cedula, String nombre, String puesto, String direccion, int edad)
    {
        this.cedula=cedula;
        this.nombre=nombre;
        this.puesto=puesto;
        this.direccion=direccion;
        this.edad=edad;
    }
    //Metodos Set
    public void setCedula(String cedula)
    {
        this.cedula=cedula;
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public void setPuesto(String puesto)
    {
        this.puesto=puesto;
    }
    public void setDireccion(String direccion)
    {
        this.direccion=direccion;
    }
    public void setEdad(int edad)
    {
        this.edad=edad;
    }
    //Funciones Get
    public String getCedula()
    {
        return this.cedula;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    public String getPuesto()
    {
        return puesto;
    }
    public String getDireccion()
    {
        return direccion;
    }
    public int getEdad()
    {
        return edad;
    }
    //Funcion retorna boolean si es tercera edad
    public boolean esTerceraEdad()
    {
        if(edad>=60)
        {
            return true;
        }
        return false;
    }
    //Funcion ToString
    public String toString()
    {
        String cadena="Cedula "+cedula+"\nNombre "+nombre+"\nPuesto: "+
        puesto+"\nDireccion "+direccion+"\nEdad "+edad;
        return cadena;
    }
}