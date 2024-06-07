/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leapmonth;

import java.util.Scanner;

public class LeapMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for the year
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        // Prompt for the month
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        // Determine if the year is a leap year
        boolean isLeapYear = (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));

        // Check if February has 29 days (leap month in a leap year)
        boolean isLeapMonth = (month == 2) && isLeapYear;

        // Output the result
        if (isLeapMonth) {
            System.out.println("The year " + year + " has a leap month in February.");
        } else {
            System.out.println("The year " + year + " does not have a leap month in February.");
        }

        scanner.close();
    }
}
