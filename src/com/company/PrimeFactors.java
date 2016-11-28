package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jcarrillo on 28/11/16.
 */

public class PrimeFactors {

    public List<Integer> generate(int number){

        List<Integer> primeFactors = new ArrayList<>();

        for (int i=2; i<=number; i++){
            while (number%i == 0){
                System.out.println(i);
                primeFactors.add(i);
                number /= i;
            }
        }

        return primeFactors;
    }
}
