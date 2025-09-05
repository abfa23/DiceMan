package DiceMan;
import java.util.Random;

public class Dice {
    Random dice = new Random ();
    int numbers = dice.nextInt(6) + 1;
}
