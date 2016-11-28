package com.company;

/**
 * Created by jcarrillo on 28/11/16.
 */

public class FizzBuzzGame {

    private final String fizz = "Fizz";
    private final String buzz = "Buzz";
    private final String fizzBuzz = "FizzBuzz";

    public void FizzBuzz(){
        for (int i=1; i<=100; i++){
            if(divisibleByThreeAndFive(i)){
                System.out.println(fizzBuzz);
            }else if(divisibleByThree(i)){
                System.out.println(fizz);
            }else if(divisibleByFive(i)){
                System.out.println(buzz);
            }else {
                System.out.println(i);
            }
        }
    }

    private boolean divisibleByThree(int number){
        return number%3 == 0;
    }

    private boolean divisibleByFive(int number){
        return number%5 == 0;
    }

    private boolean divisibleByThreeAndFive(int number){
        return divisibleByThree(number) && divisibleByFive(number);
    }
}
