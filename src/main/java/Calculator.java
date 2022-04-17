package org.iiitb;
import java.util.Scanner;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public static void main(String[] args) {

        int flag = 1;
        Scanner in = new Scanner(System.in);
        while(flag==1){

            System.out.println(" Enter which scientific operation you want to perform: ");
            System.out.println("1.Square Root");
            System.out.println("2.Factorial");
            System.out.println("3.Natural Logarithm");
            System.out.println("4.Power Function");
            System.out.println("5.Quit");

            int choice = in.nextInt();

            switch(choice){
                case 1: {
                    System.out.println("Type the number");
                    int number = in.nextInt();
                    System.out.println("Square root is" + squareRoot(number));
                    break;
                }
                
                case 2: {
                    System.out.println("Type the number");
                    int number = in.nextInt();
                    System.out.println("Factorial is " + fact(number));
                    break;
                 
                }
                case 3: {
                    System.out.println("Type the number");
                    double number = in.nextDouble();
                    System.out.println("Natural log is " + natLog(number));
                    break;
                }
                case 4: {
                    System.out.println("Type base value");
                    int base = in.nextInt();
                    System.out.println("Type  exponent value");
                    int exponent = in.nextInt();
                    System.out.println("The value of is" + Power(base, exponent));
                    break;
                }
                case 5: {
                    flag = 0;
                    System.out.println("Exiting");
                    break;
                }
                default:
                    System.out.println("Invalid Command");
            }
        }
    }

       public static int fact(int number){
        logger.info("Apply factorial function on num = " + number);
        int out = 1;
        for(int i=number; i>0; i--)
        {
            out *=i;
        }
        logger.info("Result of factorial function on " + number + " = " + out);
        return out;
    }

    public static double squareRoot(int number){
        logger.info("Apply root function on num = " + number);
        double out = Math.sqrt(number);
        logger.info("Result of root function on " + number + " = " + out);
        return out;
    }

 

   

    public static double Power(int operX, int operY){
        logger.info("Apply power function on :" + operX + "," + operY);
        double out = Math.pow(operX, operY);
        logger.info("Result of power function on " + operX + "," + operY + "  = " + out);
        return out;
    }
     public static double natLog(double number){
        logger.info("Apply natural log function on num = " + number);
        double out = Math.log(number);
        logger.info("Result of natural log function on " + number + " = " + out);
        return out;
    }
}