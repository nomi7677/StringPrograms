package com.firstpackage;

import java.util.Scanner;

public class VowelsConsonantsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the String: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int vowelCount = 0, consonantCount=0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowelCount++;
            }
            else if(str.charAt(i)>'a' && str.charAt(i)<'z'){
                consonantCount++;
            }
        }

        System.out.println("vowel character(s) are: " + vowelCount);
        System.out.println("consonant character(s) are: " + consonantCount);
    }
}
