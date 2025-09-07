package DiceMan;

public class DiceManTest{
    private Dice dice;
    private DiceMan diceman;

    public DiceManTest() {
        dice = new Dice();
        diceman = new DiceMan();
    }
    public void start() {
        int roll = dice.numbers;
        System.out.println("dit Roll: " + roll);
        diceman.lavAktivitet(roll);
    }

    public static void main(String[] args) {
        DiceManTest game = new DiceManTest();
        game.start();
    }
}
