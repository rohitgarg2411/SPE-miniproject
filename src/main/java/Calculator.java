package org.iiitb;
import java.lang.Math;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public static void main(String[] args) {

        int flag = 1;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("Please enter the number corresponding to the operation that you want to execute: ");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Power Function");
            System.out.println("5. Exit");

            int choice = in.nextInt();
            switch(choice){
                case 1: {
                    System.out.println("Input the number");
                    double number = in.nextDouble();
                    System.out.println("The Square root of " + number + " is " + sqRoot(number));
                    break;
                }
                case 2: {
                    System.out.println("Input the number");
                    int number = in.nextInt();
                    System.out.println("The Factorial of " + number + " is " + factorial(number));
                    break;
                }
                case 3: {
                    System.out.println("Input the number");
                    double number = in.nextDouble();
                    System.out.println("The natural log of " + number + " is " + naturalLog(number));
                    break;
                }
                case 4: {
                    System.out.println("Input the base value");
                    double base = in.nextDouble();
                    System.out.println("Input the exponent value");
                    double exponent = in.nextDouble();
                    System.out.println("The value of " + base + " raised to the power of " + exponent + " is " + power(base, exponent));
                    break;
                }
                case 5: {
                    flag = 0;
                    System.out.println("Thank you! Exiting now ...");
                    break;
                }
                default:
                    System.out.println("Invalid Command: Please Try Again");
            }
        }while(flag == 1);
    }

    public static double sqRoot(double number){
        logger.info("Applying square root function on number : " + number);
        double out = Math.sqrt(number);
        logger.info("Result of square root function on " + number + " is: " + out);
        return out;
    }

    public static int factorial(int number){
        logger.info("Applying factorial function on number : " + number);
        int out = 1;
        for(int i=number; i>0; i--){
            out *=i;
        }
        logger.info("Result of factorial function on " + number + " is: " + out);
        return out;
    }

    public static double naturalLog(double number){
        //logger.info("Applying natural log function on number : " + number);
        double out = Math.log(number);
        //logger.info("Result of natural log function on " + number + " is: " + out);
        return out;
    }

    public static double power(double operandX, double operandY){
        logger.info("Applying power function on : " + operandX + ", " + operandY);
        double out = Math.pow(operandX, operandY);
        logger.info("Result of power function on : " + operandX + ", " + operandY + " is: " + out);
        return out;
    }
}