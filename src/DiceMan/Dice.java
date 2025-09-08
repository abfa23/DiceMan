package DiceMan;

public class Dice {
    public int throwCount;
    public int dice;
    public int sixCounter;

    public Dice(int throwCount) {
        this.throwCount = throwCount;
    }

    public void diceThrow() {
        int i = 1;
        while (i <= throwCount) {
            dice = (int)(Math.random()*6) + 1;
            System.out.println("Terning kast: " + i);
            System.out.println("Nummer: " + dice + " blev slået.");
            i++;
            if (dice == 6) {
                sixCounter++;
            }
                if (sixCounter == 3) {
                    System.out.println("Hr. DiceMan blev for doven og blev i sengen forevigt.");
                    break;
                }
                switch (dice) {
                    case 1:
                        System.out.println(DiceMan.Breakfast);
                        break;

                    case 2:
                        System.out.println(DiceMan.Reading);
                        break;

                    case 3:
                        System.out.println(DiceMan.Swimming);
                        break;

                    case 4:
                        System.out.println(DiceMan.Fishing);
                        break;

                    case 5:
                        System.out.println(DiceMan.CallMama);
                        break;

                    case 6:
                        System.out.println(DiceMan.Sleep);
                        break;
                }
        }
    }
}