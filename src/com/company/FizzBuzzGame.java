package com.company;

/**
 * Created by jcarrillo on 28/11/16.
 */

public class FizzBuzzGame {

    public void FizzBuzz(){
        for (int i=1; i<=100; i++){

            if(divisibleByThree(i) != null){
                System.out.println(divisibleByThree(i));
            }else if(divisibleByFive(i) != null){
                System.out.println(divisibleByFive(i));
            }else {
                System.out.println(i);
            }
        }
    }

    private String divisibleByThree(int number){
        if(number%3 == 0){
            return "Fizz";
        }
        return null;
    }

    private String divisibleByFive(int number){
        if(number%5 == 0){
            return "Buzz";
        }
        return null;
    }
}
