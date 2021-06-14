/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Polanco
 */
package ex24;


import java.util.Arrays;
import java.util.Scanner;

public class App
{

    public static void main( String[] args)
    {
         App object = new App();
         object.isAnagram();
    }

    public boolean isAnagram()
    {

        System.out.println("Enter two strings and I'll tell you if they are anagrams:");

        System.out.print( "Enter the first string: " );
        Scanner s1 = new Scanner(System.in);
        String string1 = s1.nextLine();

        System.out.print( "Enter the second string: " );
        Scanner s2 = new Scanner(System.in);
        String string2 = s2.nextLine();

        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

        char[] charString1 = string1.toCharArray();
        char[] charString2 = string2.toCharArray();

        Arrays.sort(charString1);
        Arrays.sort(charString2);

        boolean status;

        status = Arrays.equals(charString1, charString2);

        if (string1.length() != string2.length()){
            System.out.println("These strings are not of equal length.");
            status = false;
        }

        if (status){
            System.out.print("\"" + string1 + "\"" + " and " + "\"" + string2 + "\"" + " are anagrams.");
}
        else {
            System.out.print("\"" + string1 + "\"" + " and " + "\"" + string2 + "\"" + " are NOT anagrams.");
        }

        return status;
    }

}
