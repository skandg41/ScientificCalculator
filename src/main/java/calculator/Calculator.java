package calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator(){}
    public static void main(String []a){
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        double num1,num2;
        do{
            System.out.println("Scientific Calculator choose your option below to perform operations :- \n");
            System.out.println("\t Press 1 for square root\n\t Press 2 for factorial\n\t Press 3 for Natural log\n\t Press 4 for Power \t");
            int choice;
            try {
                choice = scanner.nextInt();
            }catch (InputMismatchException e){
                return;
            }

            switch (choice){
                case 1:
                    // Square Root
                    try {
                        System.out.println("Enter the number : ");
                        num1 = scanner.nextDouble();
                    }catch (InputMismatchException err){
                        logger.error("Invalid input, input is not a number "+ err);
                        return;
                    }
                    System.out.println("Square root of " + num1 + " is " + calculator.squareRoot(num1));
                    break;
                case 2:
                    //Factorial
                    try {
                        System.out.println("Enter the number : ");
                        num1 = scanner.nextDouble();
                    }catch (InputMismatchException err){
                        logger.error("Invalid input, input is not a number "+ err);
                        return;
                    }
                    System.out.println("Factorial of "+num1+" is : "+ calculator.factorial(num1));
                    break;
                case 3:
                    //Natural Log
                    try {
                        System.out.println("Enter the number : ");
                        num1 = scanner.nextDouble();
                    }catch (InputMismatchException err){
                        logger.error("Invalid input, input is not a number "+ err);
                        return;
                    }
                    System.out.println("Natural log of "+num1+" is : "+ calculator.naturalLog(num1));
                    break;
                case 4:
                    //Power
                    try {
                        System.out.println("Enter the number : ");
                        num1 = scanner.nextDouble();
                        System.out.println("Enter power : ");
                        num2 = scanner.nextDouble();
                    }catch (InputMismatchException err){
                        logger.error("Invalid input, input is not a number "+ err);
                        return;
                    }
                    System.out.println("The value of "+num1+"^"+num2+" is : "+ calculator.power(num1,num2));
                    break;
                default:
                    System.out.println("Invalid Option selected , Exiting..........");
                    return;
            }
        }while (true);
    }

    public double squareRoot(double num){
        logger.info("[SQUAREROOT] - " + num );
        double result = Math.sqrt(num);
        logger.info("[RESULT - SQUAREROOT] - " + result);
        return result;
    }

    public double factorial(double num){
        logger.info("[FACTORIAL] - " + num);
        double result = 1;
        for(double i=1;i<=num;i++) {
            result *= i;
        }
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }

    public double naturalLog(double num){
        logger.info("[NATURAL LOG] - " + num);
        double result = Math.log(num);
        logger.info("[RESULT - NATURAL LOG] - " + result);
        return result;
    }

    public double power(double num,double pow){
        logger.info("[POWER] - " + num + ", " + pow);
        double result = Math.pow(num,pow);
        logger.info("[RESULT - POWER] - " + result);
        return result;

    }
}
