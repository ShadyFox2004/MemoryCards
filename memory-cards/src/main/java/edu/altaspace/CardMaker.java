package edu.altaspace;

import java.io.*;
import java.util.Scanner;

public class CardMaker {

    public static void main(String[] args) {
        String[] fileNamesList  = CardMaker.getFileNameList(DEFAULT_CARD_PATH);
        for (String string : fileNamesList) {
            String completeFileName = DEFAULT_CARD_PATH + "/" +  string;
            System.out.println(completeFileName + ":");
            System.out.println(CardMaker.getFileContent(completeFileName));            
        }
    }

    public static final String DEFAULT_CARD_PATH = "/home/shadyfox/Documents/Philosophie/Shufle";

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