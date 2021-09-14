/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Thew
 */
package com.ex12;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
	    Scanner newScanner = new Scanner(System.in);
        int principal, years, interest;
        double rate;
        System.out.print("Enter the principal: ");
        principal = newScanner.nextInt();
        System.out.print("Enter the rate of interest: ");
        rate = newScanner.nextDouble();
        System.out.print("Enter the number of years: ");
        years = newScanner.nextInt();
        interest = (int)(principal*(1+((rate/100)*years)));
        System.out.printf("After %d years at %f%%, the investment will be worth $%d.", years, rate, interest);
    }
}
