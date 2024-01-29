package org.app;

import org.junit.Test;

/**

*@author lilred

*@date 2024/01/28

package org.app;

import java.util.Scanner;

/**
 * @author lilred
 * @date 2024/01/28
 **/
public class Calculation {



    public static double multiPly(int num) {
        // Create a Scanner object to read user input
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");

        // Read the user's input as a double (assuming decimal numbers)
//        double userInput = scanner.nextDouble();

        // Close the Scanner to prevent resource leaks
//        scanner.close();
        double userInput = num;

        // Multiply the user's input by 3
        double result = userInput * 3;

        // Display the result
        System.out.println("Result: " + result);
        return result;
    }

}

