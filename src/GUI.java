import javax.swing.*;

public class GUI extends JFrame implements Runnable {

    private JLabel timer = new JLabel();

    public GUI() {
        this.setTitle("Countdown");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(300,200);
    }

    public void init() {
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI().init();
    }

    @Override
    public void run() {

    }
}
