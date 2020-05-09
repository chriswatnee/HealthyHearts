/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.healthyhearts;

import java.util.Scanner;

/**
 *
 * @author christopherwatnee
 */
public class HealthyHearts {
    
    public static void main(String[] args) {
        // Declare variables
        int userAge;
        String userAgeString;
        int maxHeartRate;

        // Prompt user for age
        Scanner userInput = new Scanner(System.in);
        System.out.print("What is your age? ");
        userAgeString = userInput.nextLine();
        userAge = Integer.parseInt(userAgeString);
        
        // Set max heart rate
        maxHeartRate = 220 - userAge;

        // Print results
        System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute");
        System.out.println("Your target heart rate zone is " + Math.round(maxHeartRate * .5) + " - "+ Math.round(maxHeartRate * .85) + " beats per minute");
    }
}
