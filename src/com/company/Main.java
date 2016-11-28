package com.company;

//Autor: Jennifer Carrillo

import java.util.Scanner;

public class Main {

    public static void menu(){

        Asterisk asteriskDraw = new Asterisk();
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        PrimeFactors primeFactors = new PrimeFactors();

        Scanner scanner = new Scanner(System.in);

        System.out.println("/***** Menu *****/");
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
        int option = scanner.nextInt();

        switch (option){
            case 1:
                asteriskDraw.oneAsterisk();
                break;
            case 2:
                System.out.print("Number of asterisks: ");
                int numberAsterisksHorizontal = scanner.nextInt();
                asteriskDraw.horizontalLine(numberAsterisksHorizontal);
                break;
            case 3:
                System.out.print("Number of asterisks: ");
                int numberAsterisksVertical = scanner.nextInt();
                asteriskDraw.verticalLine(numberAsterisksVertical);
                break;
            case 4:
                System.out.print("Number of lines: ");
                int numberLinesRightTriangle = scanner.nextInt();
                asteriskDraw.rightTriangle(numberLinesRightTriangle);
                break;
            case 5:
                System.out.print("Number of lines: ");
                int numberLinesIsoscelesTriangle = scanner.nextInt();
                asteriskDraw.isoscelesTriangle(numberLinesIsoscelesTriangle);
                break;
            case 6:
                System.out.print("Middle line number: ");
                int middleLineNumber = scanner.nextInt();
                asteriskDraw.diamond(middleLineNumber);
                break;
            case 7:
                System.out.print("Middle line number for name: ");
                int middleLineNumberForName = scanner.nextInt();
                asteriskDraw.diamondName(middleLineNumberForName);
                break;
            case 8:
                fizzBuzzGame.FizzBuzz();
                break;
            case 9:
                System.out.print("Number: ");
                int number = scanner.nextInt();
                primeFactors.generate(number);
                break;
            default:
                System.out.println("Exit");
                break;
        }

    }

    public static void main(String[] args) {
//        menu();

        Asterisk asteriskDraw = new Asterisk();

        asteriskDraw.diamond(4);
    }
}
