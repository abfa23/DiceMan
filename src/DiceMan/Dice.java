package DiceMan;
import java.util.Random;

public class Dice {
    Random dice;
    int throwCount;
    int numbers;
    int sixCounter;

    public Dice(Random dice, int numbers, int throwCount, int sixCounter) {
        this.dice = dice;
        this.numbers = numbers;
        this.throwCount = throwCount;
        this.sixCounter = sixCounter;
    }

    public void diceThrow() {
        int i = 1;
        while (i <= throwCount) {
            numbers = dice.nextInt(6) + 1;
            System.out.println("Throw count: " + i);
            System.out.println("The number: " + numbers + " rolled.");
            i++;
            if (numbers == 6) {
                sixCounter++;
            }
                if (sixCounter == 3) {
                    System.out.println("Mr. DiceMan went back to sleep");
                    break;
                }
        }
    }
}