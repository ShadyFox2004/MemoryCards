import java.io.*;
import java.util.Scanner;

public class CardMaker {
    private CardMaker(){
        
    }

    public static final String DEFAULT_CARD_PATH = "/home/shadyfox/Documents/Philosophie/Shufle";

    public static Card[] createCards(){
        return CardMaker.createCards(DEFAULT_CARD_PATH);
    }

    public static Card[] createCards(String directoryPath){
        String[] fileNamesList  = CardMaker.getFileNameList(directoryPath);
        Card[] cards = new Card[fileNamesList.length];
        String completeFilePath;
        for (int fileIndex = 0; fileIndex < cards.length; fileIndex++){
            completeFilePath = directoryPath +"/"+ fileNamesList[fileIndex];
            cards[fileIndex] = new Card(fileNamesList[fileIndex],getFileContent(completeFilePath));
        }
        return cards;
    } 

    public static String getFileContent(String cardPath) {
        String fileContent = "";
        File file = new File(cardPath);
        Scanner sc;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) // returns true if and only if scanner has another token
                fileContent = fileContent  + sc.nextLine();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fileContent;
    }

    public static String[] getFileNameList(String cardDirectoryPath) {
        // creates a file object
        File file = new File(cardDirectoryPath);
        // returns an array of all files
        String[] fileList = file.list();
        for (String str : fileList) {
            System.out.println(str);
        }
        return fileList;
    }
}
