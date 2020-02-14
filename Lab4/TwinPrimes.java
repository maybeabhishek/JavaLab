import primespackage.Primes;

public class TwinPrimes {
    public static void findTwins(int low, int high) {
        int prevPrime = 0, currentPrime =0;
        for (int i = low; i <= high; i++) {
            if(Primes.checkForPrimes(i))
                currentPrime=i;
            if(prevPrime==0 && currentPrime!=0)
                prevPrime=currentPrime;
            if(prevPrime!=0 && currentPrime!=0)
                if(Math.abs(prevPrime-currentPrime)==2)
                    System.out.println("("+prevPrime+","+currentPrime+")");
            prevPrime = currentPrime;
        }
    }
}