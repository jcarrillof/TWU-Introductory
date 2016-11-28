package com.company;

//Autor: Jennifer Carrillo

public class Main {

    public static void main(String[] args) {

        Asterisk asteriskDraw = new Asterisk();
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        PrimeFactors primeFactors = new PrimeFactors();

//        asteriskDraw.oneAsterisk();
//        asteriskDraw.horizontalLine(8);
//        asteriskDraw.verticalLine(4);
//        asteriskDraw.rightTriangle(3);
//        asteriskDraw.isoscelesTriangle(3);
//        asteriskDraw.diamond(3);
//        asteriskDraw.diamondName(3);
//
//        fizzBuzzGame.FizzBuzz();

        System.out.println(primeFactors.generate(30));

    }
}
