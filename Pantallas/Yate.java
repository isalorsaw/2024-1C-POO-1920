import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
public class Yate extends Coordenada
{
    boolean visible;
    int salto;
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
        salto=5;
        visible=true;
    }
    public void setImagen(String ruta)
    {
        this.icono=new ImageIcon(getClass().getResource(ruta));
        this.imagen=icono.getImage();
    }
    public void dibuja(Graphics g)
    {
        if(visible)
         g.drawImage(imagen,this.x,this.y,null);
    }
    public void mover(char mov, String ruta)
    {
        if(mov=='r')
        {
            x+=salto;
        }
        else if(mov=='l')x-=salto;
        setImagen(ruta);
    }
    public void mover(char mov)
    {
        if(mov=='r')
        {
            x++;
        }
        else if(mov=='l')x--;
    }
    public String toString()
    {
        return super.toString();
    }
}