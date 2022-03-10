import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Stopwatch extends Thread implements KeyListener {

    public boolean pressed = false;
    public static int counter = 0;



    @Override
    public void run() {

        while(true) {
            System.out.println(counter + " Second/s");
            counter++;

            if(pressed) {
                System.out.println("S pressed");
            }

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
        if(e.getKeyCode() == 83){
            pressed = true;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
