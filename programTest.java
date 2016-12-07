/**
 * Created by Hugo on 11/23/2016.
 */
import java.util.Scanner;

public class programTest {
    public static void main(String[] args, int diceReturns) {

        System.out.println("Start");
        for (int i = 0; i < 25; i++)
        {
            Runnable die = new Dice();
            Thread worker = new Thread(die);

            worker.setName("Dice#" + String.valueOf(i + 1));
            worker.start();
        }
        System.out.println("Complete");

        System.out.println("Start");
        for (int i = 0; i < 10; i++) {
            Runnable car1 = new Truck();
            Thread worker = new Thread(car1);

            worker.setName("Truck " + String.valueOf(+1));
            worker.start();
        }
        System.out.println("Complete");

        for (int i = 0; i < 10; i++) {
            Runnable car2 = new Van();
            Thread worker2 = new Thread(car2);

            worker2.setName("Truck " + String.valueOf(+1));
            worker2.start();
        }

        System.out.println("Start");
        for (int i = 0; i < 10; i++) {
            Runnable car3 = new Sports();
            Thread worker3 = new Thread(car3);

            worker3.setName("Truck " + String.valueOf(+1));
            worker3.start();
        }
        System.out.println("Complete");
    }
}
