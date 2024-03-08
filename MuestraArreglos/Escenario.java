import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.KeyListener;//Libreria para evento de teclado
import java.awt.event.KeyEvent;//Libreria para utilizar variable de evento del teclado
public class Escenario extends JPanel implements KeyListener
{
    Fondo f;
    //Yate y;
    Yate y[]=new Yate[10];
    public Escenario()
    {
        f=new Fondo("imagenes/fondo2.png",0,0);
        //y=new Yate("imagenes/lancha.png",10,450);
        inicializarYates();//Inicializar el arreglo de Yates de forma aleatoria
        imprimirYates();
        //System.out.println(f.toString());
        addKeyListener(this);//Agregar en en JPanel el evento del teclado
        setFocusable(true);//Linea para priorizar el Panel
        setVisible(true);
    }
    public void imprimirYates()
    {System.out.println("++++++++++++++++++++++++++++++++\n");
        for(int i=0;i<y.length;i++)
        {
            System.out.println(i+" "+y[i].toString());
        }
    }
    public void inicializarYates()
    {
        for(int i=0;i<y.length;i++)
        {
            int xx=ClaseFM.generaAleatorio(10,900);
            int yy=ClaseFM.generaAleatorio(400,480);
            y[i]=new Yate("imagenes/lancha.png",xx,yy);
        }
    }
    public void dibujarYates(Graphics g)
    {
        for(int i=0;i<y.length;i++)
        {
            y[i].dibuja(g);
        }
    }
    public void keyTyped(KeyEvent evt)
    {
        //eventoTeclas(evt);
    }
    public void keyPressed(KeyEvent evt)
    {
        //eventoTeclas(evt);
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
            moverYates('r',"imagenes/lancha_der.png");
        }
        else if(codigo==37)
        {
            moverYates('l',"imagenes/lancha_izq.png");
        }
        //else if(codigo==37)y.mover('l',"imagenes/lancha_izq.png");
        //System.out.println(y.toString()+" "+codigo+"");
        repaint();
    }
    public void moverYates(char dir, String ruta)
    {
        for(int i=0;i<y.length;i++)
        {
            y[i].mover(dir,ruta);
        }
        imprimirYates();
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawString("Elaborado por Ing Isaias Salinas",200,200);
        f.dibuja(g);
        //y.dibuja(g);
        dibujarYates(g);//Metodo para dibujar el arreglo de yates
    }
}