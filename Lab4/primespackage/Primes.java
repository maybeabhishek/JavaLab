package primespackage;

public class Primes{
    static public boolean checkForPrimes(int a){
        int b = a;
        for(int i =b-1;i>=2; i--){
            if(b%i==0)
                return false;
        }
        return true;
    }
}
