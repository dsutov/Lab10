import java.util.Scanner;

public class Countdown extends Thread{

    public int seconds = 10;

    public Countdown(int seconds){
        this.seconds = seconds;
    }

    @Override
    public void run() {

        for(int i = seconds; i > 0 ;i--){
            System.out.println("Time left: " + i + " Second/s");

            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Error");
            }
        }
        System.out.println("Finish");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter an integer value: ");
        int input = scan.nextInt();

        Countdown t1 = new Countdown(input);
        t1.start();

    }
}
