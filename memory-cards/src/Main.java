import java.util.Random;

public class Main 
{
    public static void main( String[] args )
    {
        Card[] cards = CardMaker.createCards();
        Random random = new Random();

        while(true){
            Card myCard = Utility.randomCard(cards, random);
            Utility.showOneAspect(myCard, random);
            String answer = Utility.askQuestion("?");
            System.out.println(myCard);
            System.out.println("Your answer was: " + answer);
            Utility.askQuestion("How close were you?");
            System.out.println("\n\n\nNext one, get ready!");
        }
    }
}
