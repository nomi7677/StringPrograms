package com.firstpackage;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        //String s1 = "iceman";
      //  String s2 = "cinema";
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Please enter first string");
        String s1=sc1.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Please enter second string");
        String s2=sc2.nextLine();

        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        if (s1.length() == s2.length()) {
            char[] array1 = s1.toCharArray();
            char[] array2 = s2.toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);
            boolean output = Arrays.equals(array1, array2);
            if (output) {
                System.out.println("The Strings " + s1 + " and " + s2 + " are Anagram");
            } else {
                System.out.println("The Strings " + s1 + " and " + s2 + " are not Anagram");
            }

        }
        else{
           System.out.println("The Strings "+ s1+ " and "+s2+ " are not Anagram");
          }
        }

    }
