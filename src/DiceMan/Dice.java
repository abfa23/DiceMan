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
            switch (numbers) {
                case 1:
                    System.out.println("DiceMan eats breakfast.");
                    break;
                case 2:
                    System.out.println("DiceMan studies something boring.");
                    break;
                case 3:
                    System.out.println("DiceMan goes swimming.");
                    break;
                case 4:
                    System.out.println("DiceMan goes fishing.");
                    break;
                case 5:
                    System.out.println("DiceMan calls his mom.");
                    break;
                case 6:
                    System.out.println("DiceMan goes back to bed.");
            }
        }
    }
}