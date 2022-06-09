package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ZnakiSlowa {
    int liczZnaki = 0;
    int liczSpacje = 0;
    int liczSlowa = 0;

    void liczZnakiSlowa(File myObj) throws FileNotFoundException {
        Scanner myReader = new Scanner(myObj);
        int x = 0;
        while (myReader.hasNextLine()){
            String data = myReader.nextLine();
            liczZnaki += data.length();
            char[] dataChar = data.toCharArray();
            for(int i = 0; i < data.length(); i++) {
                if(Character.isWhitespace(dataChar[i])) {
                    liczSpacje++;
                }
            }
            x++;
        }
        liczSpacje += x;
        liczSlowa += liczSpacje;
        myReader.close();
        System.out.println("Liczba znakow: " + liczZnaki);
        System.out.println("Liczba bialych znakow: " + liczSpacje);
        System.out.println("Liczba slow: " + liczSlowa);
    }
}
