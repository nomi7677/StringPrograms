package com.firstpackage;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string value: ");
        String str = sc.nextLine();
// convert string into charArray
        char[] arr = str.toCharArray();
// sort the array
        Arrays.sort(arr);

        System.out.println(arr);
    }
}
