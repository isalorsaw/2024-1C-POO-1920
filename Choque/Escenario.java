import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.awt.event.KeyListener;//Libreria para evento de teclado
import java.awt.event.KeyEvent;//Libreria para utilizar variable de evento del teclado
import java.awt.event.ActionListener;//Libreria para eventos de click o timer
import java.awt.event.ActionEvent;//Libreria para utilizar variabla de evento de click o timer
public class Escenario extends JPanel implements KeyListener,ActionListener
{
    Fondo f;
    Lancha l;
    Piedra p;
    Timer t;
    int aleatorio;
    int segundos;
    public Escenario()
    {
        f=new Fondo("fondo2.png",0,0);
        l=new Lancha("lancha.png",10,400);
        p=new Piedra("piedra.png",600,400);
        //inicializarYates();//Inicializar el arreglo de Yates de forma aleatoria
        
        //System.out.println(f.toString());
       
        //Instanciar el Timer
        //aleatorio=ClaseFM.generaAleatorio(1,2);
        //JOptionPane.showMessageDialog(null,aleatorio+"");
        segundos=0;
        t=new Timer(50,null);//Cada 5 milisegundos se va a ejectuar el actionPerformed
        t.start();
        t.addActionListener(this);//Agregando en el JPanel el evento de accion del click o timer
        
        
        addKeyListener(this);//Agregar en en JPanel el evento del teclado
        setFocusable(true);//Linea para priorizar el Panel
        setVisible(true);
    }
    /*public void imprimirYates()
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
    }*/
    public void actionPerformed(ActionEvent evt)
    {
        if(evt.getSource()==t)
        {
            //System.out.println(segundos+"");
            segundos++;
            
            boolean choq=l.choque(p.rec);
            //System.out.println("Choque "+choq);
            
            if(choq==false)
            {
                l.mover();//Mover la lancha si no hay choque o sea frenar
            }
            
            if(choq==true)
            {
                //l.desaparecer();
                //p.desaparecer();
                l.setImagen("explosion.gif");
            }
            
            //Frenar la lancha X
            //Desaparecer la lancha X
            //Desaparecer la piedra X
            //Cambiar de imagen 
            
            
            
            /*char direccion=' ';
            String rutay="";
            if(aleatorio==1)
            {
                direccion='l';//Izquierda
                rutay="imagenes/lancha_izq.png";
            }
            else if(aleatorio==2)
            {
                direccion='r';//Derecha
                rutay="imagenes/lancha_der.png";
            }*/
            repaint();
        }
        //if(evt.getSource()==t2)
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
        /*int codigo=evt.getKeyCode();//Codigo ASCII que cada tecla
        if(codigo==39)//Mov a la derecha
        {
            moverYates('r',"imagenes/lancha_der.png");
        }
        else if(codigo==37)
        {
            moverYates('l',"imagenes/lancha_izq.png");
        }
        //else if(codigo==37)y.mover('l',"imagenes/lancha_izq.png");
        //System.out.println(y.toString()+" "+codigo+"");*/
        repaint();
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawString("Elaborado por Ing Isaias Salinas",200,200);
        f.dibuja(g);
        l.dibuja(g);
        p.dibuja(g);
    }
}