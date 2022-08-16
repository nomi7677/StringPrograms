package com.firstpackage;

import java.util.HashSet;
import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the phrase to check if it is Pangram (consists all alphabets from a-z) or not");
        String str = sc.nextLine();

        // convert all strings to lower case and remove white spaces
        str = str.toLowerCase().replaceAll(" ","");

        // Convert str to char array
        char[] arr = str.toCharArray();

        // Initialize HashSet
        HashSet<Character> set = new HashSet<>();

        // Iterating char array using for Each loop
        for(char ch : arr)
        {
            set.add(ch);
        }

        // If set size is 26 then str is Pangram otherwise not
        if(set.size() == 26)
            System.out.println("Input String is Pangram");
        else
            System.out.println("Input String is NOT Pangram");
    }
}
