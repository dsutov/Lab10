import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Stopwatch extends Thread implements KeyListener {
    public int seconds = 1000000000;

    public Stopwatch() {
        //this.seconds = seconds;
    }

    @Override
    public void run() {

        for(int i = 0; i < seconds;i++) {
            System.out.println(i + " Second/s");

            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("Error");
            }
        }
        
    }

    public static void main(String[] args) {

        Stopwatch t1 = new Stopwatch();
        Stopwatch t2 = new Stopwatch();
        t1.start();
        t2.start();

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {



    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
