import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
public class Yate extends Coordenada
{
    Image imagen;
    ImageIcon icono;
    public Yate()
    {
        
    }
    public Yate(String ruta, int x, int y)
    {
        super(x,y);
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