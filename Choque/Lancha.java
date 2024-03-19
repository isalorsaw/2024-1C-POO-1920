import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;//Rectangulo para detectar choque
import javax.swing.ImageIcon;
public class Lancha
{
    int salto;
    int x;
    int y;
    Image imagen;
    ImageIcon icono;
    Rectangle rec;
    boolean visible;
    public Lancha()
    {
        
    }
    public Lancha(String ruta, int x, int y)
    {
        this.x=x;
        this.y=y;
        this.icono=new ImageIcon(getClass().getResource(ruta));
        this.imagen=icono.getImage();
        salto=5;
        setRectangle();
        visible=true;
    }
    public void setImagen(String ruta)
    {
        this.icono=new ImageIcon(getClass().getResource(ruta));
        this.imagen=icono.getImage();
        setRectangle();
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
        if(visible==true)//Si se puede visualizar la lancha
        g.drawImage(imagen,this.x,this.y,null);
    }
    public boolean choque(Rectangle otro)
    {
        boolean b=this.rec.intersects(otro);
        return b;
        
    }
    public String toString()
    {
        return "Lancha "+x+" "+y;
    }
    public void mover()
    {
        x+=salto;
        setRectangle();
    }
}