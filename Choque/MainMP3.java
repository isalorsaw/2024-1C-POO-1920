import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.File;
public class MainMP3
{
    public static void main(String[] args) 
    {
        File file=new File("mariobros.mp3");
        String ruta=file.getAbsolutePath();
        //System.out.println(ruta);
        
        //String filename = "mariobros.mp3";//Inicializamos la Ruta
        MP3Player mp3Player = new MP3Player(ruta);//Inicializamos MP3Player
        mp3Player.play();//Reproducimos

        Scanner sc = new Scanner(System.in);
        System.out.println("Write stop to stop the music: ");

        if (sc.nextLine().equalsIgnoreCase("stop")) {
            mp3Player.close();
        }/**/
    }
}