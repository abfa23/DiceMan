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
            System.out.println("Terning kast: " + i);
            System.out.println("Nummer: " + numbers + " blev slået.");
            i++;
            if (numbers == 6) {
                sixCounter++;
            }
                if (sixCounter == 3) {
                    System.out.println("Hr. DiceMan blev for doven og blev i sengen forevigt.");
                    break;
                }
        }
    }
}