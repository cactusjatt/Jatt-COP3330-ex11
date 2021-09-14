/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Sarim Jatt
 */
package org.example;
import java.util.Scanner;
import java.text.DecimalFormat;
public class App
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        double euros, conv;
        System.out.print("How many euros are you exchanging? ");
        euros = in.nextInt();
        System.out.print("What is the exchange rate? ");
        conv = in.nextDouble();

        double dollars = euros * conv;
        DecimalFormat df = new DecimalFormat("#.##");

        String newline = System.lineSeparator();

        System.out.println(df.format(euros) + " euros at an exchange rate of " + conv + " is " + newline + df.format(dollars) + " U.S. Dollars.");

        in.close();
    }
}