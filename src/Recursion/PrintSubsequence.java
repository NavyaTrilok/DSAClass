package Recursion;

import java.util.Scanner;

public class PrintSubsequence {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printSS(str,"");


    }

    public static void printSS(String str, String ans) {

        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }

        char first_char=str.charAt(0);
        String ros = str.substring(1);
        printSS(ros,ans+first_char);
        printSS(ros,ans);


    }
}