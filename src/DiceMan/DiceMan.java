package DiceMan;
// Klassen "DiceMan" styrer, hvilke aktiviteter der sker
public class DiceMan {

    // Konstruktør
    public DiceMan() {

    }

    // Metode, der bestemmer, hvad Dice Man gør, når han kaster en terning
    public void lavAktivitet(int dice) {
        if (dice == 1) {
            System.out.println("Spiser morgenmad");
        } else if (dice == 2) {
            System.out.println("Studerer noget kedeligt");
        } else if (dice == 3) {
            System.out.println("Svommer");
        } else if (dice == 4) {
            System.out.println("Fisker");
        } else if (dice == 5) {
            System.out.println("Ringer til sin mor");
        } else if (dice == 6) {
            System.out.println("Gar tilbage i seng");
          }
    }
}

// Redegørelse og begrebsafklaring:

// * public betyder, at det kan tilgås af andre
// * class er en ny klasse med navnet Dice Man
// * public DiceMan() er en konstruktør, der laver et nyt objekt med DiceMan
// * {} krøllede parenteser, der viser, hvor en klasse eller metode slutter
// * void betyder, at metoden ikke returner noget tilbage
// * lavAktivitet er en metode med parameter (inputværdi) kaldet dice
// * if (...) { ... } else if (...) { ... } betyder, "hvis dette gælder, gør dette eller prøv næste".
// * System.out,println(...) printer tekst ud i konsollen
// (dice == 6), hvor == ikke er det samme som =. = sætter en værdi fx hvis = 6 ville terningens værdi være 6, men == betyder, "er dice lig med 6? I så fald udfør koden