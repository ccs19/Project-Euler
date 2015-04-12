package com.company;

public class LargestPrimeFactor {

    static long arbitraryNum = 600851475143L;

    public static void main(String[] args) {

        long i = 5;

        while(true){
            if (isPrime(i)) {
                if(arbitraryNum % i == 0){
                    System.out.println(i);
                }
            }

            i++;
        }


    }

    public static boolean isPrime(long number){
        if( number <= 3 ){
            return number>1;
        }
        else if( (number %2) == 0 || (number % 3)== 0){
            return false;
        }
        else{ //For prime numbers, we only have to check numbers up to sqrt(number)
            double squareRoot = Math.sqrt(number);
            for(int i = 5; i <= squareRoot; i++){
                if( number % i == 0 || number % (i + 2) == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
