package com.firstpackage;

import java.util.Scanner;

public class SpecialCharacters {
    public static <Char> void main(String[] args) {
        int alphabet = 0, digit=0,symbol=0;

        Scanner sc = new Scanner (System.in);
        System.out.println ("Please enter a String");
        String str = sc.nextLine();
        StringBuilder tempStr = new StringBuilder(str);
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                alphabet++;
            }else if(ch >= '0' && ch <= '9'){
                digit++;
            }else{
                symbol++;
            }
        }
        System.out.println ("alphabet = "+alphabet+", Digit = "+ digit+", Symbol = "+symbol);

    }
}
