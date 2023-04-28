package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("sample3.txt");
        Scanner scanner = new Scanner(file);
        int wordCount = 0;

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            int words = line.split(" ").length;
            wordCount += words;
        }

        System.out.println(wordCount);
    }
}