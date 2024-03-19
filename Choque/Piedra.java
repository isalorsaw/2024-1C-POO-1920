import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
public class Piedra
{
    boolean visible;
    int x;
    int y;
    Image imagen;
    ImageIcon icono;
    Rectangle rec;
    public Piedra()
    {
        
    }
    public Piedra(String ruta, int x, int y)
    {
        this.x=x;
        this.y=y;
        this.icono=new ImageIcon(getClass().getResource(ruta));
        this.imagen=icono.getImage();
        setRectangle();
        visible=true;
    }
    public void setRectangle()
    {
        this.rec=new Rectangle(x,y,icono.getIconWidth(),icono.getIconHeight());
    }
    public void desaparecer()
    {
        visible=false;
    }
    public void dibuja(Graphics g)
    {
        if(visible)
        g.drawImage(imagen,this.x,this.y,null);
    }
    public String toString()
    {
        return "Lancha "+x+" "+y;
    }
}