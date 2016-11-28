package com.company;

/**
 * Created by jcarrillo on 28/11/16.
 */
public class PrimeFactors {

    public void generate(int number){
        for (int i=2; i<number; i++){
            if(number%i == 0){
                System.out.println(i);
            }
        }
    }
}
