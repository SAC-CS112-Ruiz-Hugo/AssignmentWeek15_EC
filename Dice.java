/**
 * Created by Cule on 11/23/2016.
 */
import java.util.Random;

public class Dice implements Runnable {

    private int Throw()

    {
        Random random = new Random();

        int diceRolls = 0;

        for (int i = 0; i < diceRolls; i++)
        {
            int randomNumber = random.nextInt(6) + 1;
            diceRolls += randomNumber;
        }
        return diceRolls;
    }

    public void run ()
    {
        int diceVal;
        diceVal = Throw();
        System.out.println("Thread " + Thread.currentThread().getName() + "Dice Val = " + diceVal);
    }
}
