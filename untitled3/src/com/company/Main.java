package com.company;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        ZnakiSlowa zs = new ZnakiSlowa();
        File myObj = new File("test.txt");
        zs.liczZnakiSlowa(myObj);
    }
}
