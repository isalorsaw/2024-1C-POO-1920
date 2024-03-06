import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.KeyListener;//Libreria para evento de teclado
import java.awt.event.KeyEvent;//Libreria para utilizar variable de evento del teclado
public class Escenario extends JPanel implements KeyListener
{
    Fondo f;
    Yate y;
    public Escenario()
    {
        f=new Fondo("imagenes/fondo2.png",0,0);
        y=new Yate("imagenes/lancha.png",10,450);
        //System.out.println(f.toString());
        addKeyListener(this);//Agregar en en JPanel el evento del teclado
        setFocusable(true);//Linea para priorizar el Panel
        setVisible(true);
    }
    public void keyTyped(KeyEvent evt)
    {
        eventoTeclas(evt);
    }
    public void keyPressed(KeyEvent evt)
    {
        eventoTeclas(evt);
    }
    public void keyReleased(KeyEvent evt)
    {
        eventoTeclas(evt);
    }
    //Tratar los movimientos de las teclas
    public void eventoTeclas(KeyEvent evt)
    {
        int codigo=evt.getKeyCode();//Codigo ASCII que cada tecla
        if(codigo==39)//Mov a la derecha
        {
            y.mover('r',"imagenes/lancha_der.png");//right=derecha
            //y.mover('l');//left=izq
            //y.mover('u');//up=arriba
            //y.mover('d');//down=abajo
        }
        else if(codigo==37)y.mover('l',"imagenes/lancha_izq.png");
        System.out.println(y.toString()+" "+codigo+"");
        repaint();
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawString("Elaborado por Ing Isaias Salinas",200,200);
        f.dibuja(g);
        y.dibuja(g);
    }
}