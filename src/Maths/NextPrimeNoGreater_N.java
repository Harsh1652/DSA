package Maths;

public class NextPrimeNoGreater_N {
    static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        if (num == 2){
            return true;
        }
        if (num % 2 == 0){
            return false;
        }

        for (int i = 3; i<Math.sqrt(num); i+=2) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    static void NxtPrimeNo(int num){
        int nxtNum = num + 1;
        while (!isPrime(nxtNum)){
            nxtNum++;
        }

        System.out.println("The next prime number greater than " + num + " is: " + nxtNum);

    }
    public static void main(String[] args) {

        int num = 11;
        NxtPrimeNo(num);
    }
}
