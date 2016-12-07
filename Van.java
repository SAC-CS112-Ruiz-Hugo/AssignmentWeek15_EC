/**
 * Created by Cule on 11/26/2016.
 */
public class Van implements Runnable {

    public void setSound(int distanceTraveled) {
        if (distanceTraveled <= 10) {
            System.out.println("Prrr");
        } else if (distanceTraveled > 10 && distanceTraveled <= 100)
            System.out.println("Vroom");
        try {
            if (distanceTraveled > 100)
                System.out.println("Sputter...");
        } catch (Exception exception) {
            System.err.println("Your automobile is sputtering!");
        }
    }

    public void run() {
        try {

            System.out.println("Total units / Total miles = " + Thread.currentThread().getName());
        } catch (Exception e) {
            System.err.println("Your automobile is sputtering!");
        }
    }

}