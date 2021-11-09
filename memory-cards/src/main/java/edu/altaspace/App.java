package edu.altaspace;

import javax.swing.UIClientPropertyKey;

public class App 
{
    public static void main( String[] args )
    {
        Card[] cards = CardMaker.createCards();

        while(true){
            Card myCard = Utility.randomCard(cards);
            Utility.showOneAspect(myCard);
            String answer = Utility.askQuestion("?");
            System.out.println(myCard);
            System.out.println("Your answer was: " + answer);
            Utility.askQuestion("How close were you?");
            System.out.println("\n\n\nNext one, get ready!");
        }
    }
}
