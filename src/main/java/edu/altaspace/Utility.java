package edu.altaspace;

import java.util.Random;
import java.util.Scanner;


public class Utility {
    private Utility(){}

    public static String askQuestion(String question) {
        System.out.print(question + ": ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static int headOrTail(Random random) {
        return random.nextInt(1); 
    }

    public static void showOneAspect(Card card, Random  random){
        if(Utility.headOrTail(random) == 0){
            System.out.println("Guess the content of: " + card.getName()+"\n");
        } else {
            System.out.println("Guess witch reference it is:" + card.getText() + "\n");
        }
    }

    public static Card randomCard(Card[] cards, Random  random){
        int cardNumber = random.nextInt(cards.length);
        return cards[cardNumber];
    }

}
