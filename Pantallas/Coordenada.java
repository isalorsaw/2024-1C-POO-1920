public class Coordenada
{
    //Atributos
    int x;
    int y;
    public Coordenada()
    {
        x=0;
        y=0;
    }
    public Coordenada(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    public void setX(int x)
    {
        this.x=x;
    }
    public void setY(int y)
    {
        this.y=y;
    }
    public int getX()
    {
        return this.x;
    }
    public int getY()
    {
        return this.y;
    }
    public String toString()
    {
        return "X "+x+" Y "+y;
    }
}