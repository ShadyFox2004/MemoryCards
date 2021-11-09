package edu.altaspace;

import java.util.Random;
import java.util.Scanner;


public class Utility {
    public static String askQuestion(String question) {
        System.out.print(question + ": ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static int headOrTail() {
        Random  random = new Random();
        return random.nextInt()%2; 
    }

    public static void showOneAspect(Card card){
        if(Utility.headOrTail() == 0){
            System.out.println("Guess the content of: " + card.getName()+"\n");
        } else {
            System.out.println("Guess witch reference it is:" + card.getText() + "\n");
        }
    }

    public static Card randomCard(Card[] cards){
        Random  random = new Random();
        return cards[random.nextInt()%cards.length];
    }

}
