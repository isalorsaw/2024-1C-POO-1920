import javax.swing.JPanel;
import java.awt.Graphics;
public class Escenario extends JPanel
{
    Fondo f;
    Yate y;
    public Escenario()
    {
        f=new Fondo("imagenes/fondo2.png",0,0);
        y=new Yate("imagenes/lancha.png",10,450);
    
        System.out.println(f.toString());
        
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawString("Elaborado por Ing Isaias Salinas",200,200);
        f.dibuja(g);
        y.dibuja(g);
    }
}