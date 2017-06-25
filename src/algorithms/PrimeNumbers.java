package algorithms;

/**
 * Created by blaise on 6/7/17.
 *
 */
public class PrimeNumbers {
    public boolean isPrime(int number){

        if(number %2 == 0)
            return false;
        for (int i = 3; (i * i) <= number; i +=2) {
            if(number % i == 0)
                return false;
        }
        return true;
    }
    public int nextPrime(int number){
        int i = number;
        while(true){
            if(isPrime(i)) return i;
            i ++;
        }
    }
}
