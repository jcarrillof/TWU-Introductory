package com.company;

// Jennifer Carrillo

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static void menu(){

        Asterisk asteriskDraw = new Asterisk();
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        PrimeFactors primeFactors = new PrimeFactors();

        System.out.println("\n/***** Menu *****/");
        System.out.println("\nSelect an option:\n");
        System.out.println("1. Print one asterisk");
        System.out.println("2. Draw a horizontal line");
        System.out.println("3. Draw a vertical line");
        System.out.println("4. Draw a right triangle");
        System.out.println("5. Isosceles triangle");
        System.out.println("6. Diamond");
        System.out.println("7. Diamond with name");
        System.out.println("8. FizzBuzz");
        System.out.println("9. Prime Factors");

        System.out.print("\nOption: ");
        Scanner scanner = new Scanner(System.in);

        try{
            int option = scanner.nextInt();
            Scanner scannerNumber = new Scanner(System.in);
            switch (option){
                case 1:
                    asteriskDraw.oneAsterisk();
                    break;
                case 2:
                    System.out.print("Number of asterisks: ");
                    try {
                        int numberAsterisksHorizontal = scannerNumber.nextInt();
                        asteriskDraw.horizontalLine(numberAsterisksHorizontal);
                    }catch (InputMismatchException e){
                        System.err.println("\nThe number of asterisks must be an integer\n");
                        break;
                    }
                    break;
                case 3:
                    System.out.print("Number of asterisks: ");
                    try {
                        int numberAsterisksVertical = scannerNumber.nextInt();
                        asteriskDraw.verticalLine(numberAsterisksVertical);
                    }catch (InputMismatchException e){
                        System.err.println("\nThe number of asterisks must be an integer\n");
                        break;
                    }
                    break;
                case 4:
                    System.out.print("Number of lines: ");
                    try {
                        int numberLinesRightTriangle = scannerNumber.nextInt();
                        asteriskDraw.rightTriangle(numberLinesRightTriangle);
                    }catch (InputMismatchException e){
                        System.err.println("\nThe number of lines must be an integer\n");
                        break;
                    }
                    break;
                case 5:
                    System.out.print("Number of lines: ");
                    try {
                        int numberLinesIsoscelesTriangle = scannerNumber.nextInt();
                        asteriskDraw.isoscelesTriangle(numberLinesIsoscelesTriangle);
                    }catch (InputMismatchException e){
                        System.err.println("\nThe number of lines must be an integer\n");
                        break;
                    }
                    break;
                case 6:
                    System.out.print("Middle line number: ");
                    try {
                        int middleLineNumber = scannerNumber.nextInt();
                        asteriskDraw.diamond(middleLineNumber);
                    }catch (InputMismatchException e){
                        System.err.println("\nThe middle line number must be an integer\n");
                        break;
                    }
                    break;
                case 7:
                    System.out.print("Middle line number for name: ");
                    try {
                        int middleLineNumberForName = scannerNumber.nextInt();
                        asteriskDraw.diamondName(middleLineNumberForName);
                    }catch (InputMismatchException e){
                        System.err.println("\nThe middle line number must be an integer\n");
                        break;
                    }
                    break;
                case 8:
                    fizzBuzzGame.FizzBuzz();
                    break;
                case 9:
                    System.out.print("Number: ");
                    try {
                        int number = scannerNumber.nextInt();
                        primeFactors.generate(number);
                    }catch (InputMismatchException e){
                        System.err.println("\nThe number must be an integer\n");
                        break;
                    }
                    break;
                default:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
            }
        } catch (InputMismatchException e) {
            System.err.println("\nThe option must be an integer\n");
        }
    }

    public static void main(String[] args) {
        while (true){
            menu();
            System.out.println("\n");
        }
    }
}
