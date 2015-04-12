package com.company;

import java.math.BigInteger;

public class Main {

    static long sum = 2;

    public static void main(String[] args) {

        long numOne = 1, numTwo = 2;
        long temp =0, tempNum = 0;
        BigInteger bigInteger;



        while(true){
            temp = fib(0, numOne, numTwo);
            if(temp > 4000000) break;
            if(temp%2 == 0){
                sum += temp;
            }
            numOne = numTwo;
            numTwo = temp;
        }
        System.out.println(sum);
    }


    public static long fib(int numTerms, long numOne, long numTwo){
        return numOne+numTwo;
    }

}
