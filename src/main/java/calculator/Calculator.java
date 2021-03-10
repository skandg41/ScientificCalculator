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
            double result = -1000;
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
                    logger.info("[SQUAREROOT] - " + num1 );
                    result = Math.sqrt(num1);
                    logger.info("[RESULT - SQUAREROOT] - " + result);
                    System.out.println("Square root of " + num1 + " is " + result);
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
                    logger.info("[FACTORIAL] - " + num1);
                    result = calculator.factorial(num1);
                    logger.info("[RESULT - FACTORIAL] - " + result);
                    System.out.println("Factorial of "+num1+" is : "+ result);
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
                    logger.info("[NATURAL LOG] - " + num1);
                    result = Math.log(num1);
                    logger.info("[RESULT - NATURAL LOG] - " + result);
                    System.out.println("Natural log of "+num1+" is : "+ result);
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
                    logger.info("[POWER] - " + num1 + ", " + num2);
                    result = Math.pow(num1,num2);
                    logger.info("[RESULT - POWER] - " + result);
                    System.out.println("The value of "+num1+"^"+num2+" is : "+result);
                    break;
                default:
                    System.out.println("Invalid Option selected , Exiting..........");
                    return;
            }
        }while (true);

    }
    double factorial(double n){
        double fact = 1;
        for(double i=1;i<=n;i++){
            fact *= i;
        }
        return fact;
    }
}
