package com.firstpackage;

import java.util.Locale;
import java.util.Scanner;

public class RepeatedCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Strings");
        String str = sc.nextLine();

        // converting all strings to lowercase
        str= str.toLowerCase();

        // converting string to the charArray
        char[] ch_array = str.toCharArray();

        System.out.print("Duplicate Characters in above string are: ");

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (ch_array[i] == ch_array[j]) {
                    System.out.print(ch_array[j] + " ");
                    break;
                }
            }
        }
    }
}
