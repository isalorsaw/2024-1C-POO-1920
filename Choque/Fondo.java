import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
public class Fondo
{
    int x;
    int y;
    Image imagen;
    ImageIcon icono;
    public Fondo()
    {
        
    }
    public Fondo(String ruta, int x, int y)
    {
        this.x=x;
        this.y=y;
        this.icono=new ImageIcon(getClass().getResource(ruta));
        this.imagen=icono.getImage();
    }
    public void dibuja(Graphics g)
    {
        g.drawImage(imagen,this.x,this.y,null);
    }
    public String toString()
    {
        return super.toString();
    }
}