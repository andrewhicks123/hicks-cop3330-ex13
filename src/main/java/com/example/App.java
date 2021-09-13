/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Andrew Hicks
 */

package com.example;
import java.text.DecimalFormat;
import java.util.*;

public class App{
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("####0.00");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        int principal = input.nextInt();
        System.out.print("Enter the rate of interest: ");
        double interest = input.nextDouble();
        double rounded = interest / 100;
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        int compound = input.nextInt();

        double total = principal * Math.pow(1 + (rounded/compound), years * compound) ;


        System.out.println("$" + principal + " invested at " + interest + "%, for " + years + " years compounded " + compound + " times per year is $"+ df.format(total));
    }

}
