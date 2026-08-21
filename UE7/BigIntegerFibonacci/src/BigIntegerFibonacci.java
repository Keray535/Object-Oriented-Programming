import java.math.BigInteger;
import java.util.HashMap;

public class BigIntegerFibonacci {

    private static final HashMap<Integer, BigInteger> memo = new HashMap<>();

    public static BigInteger fib1(int n) {
        if (n == 0) return BigInteger.ZERO;
        if (n == 1) return BigInteger.ONE;

        return fib1(n - 1).add(fib1(n - 2));
    }

    public static BigInteger fib2(int n) {
        if (n == 0) return BigInteger.ZERO;
        if (n == 1) return BigInteger.ONE;

        
        if (!memo.containsKey(n)) {
            memo.put(n, fib2(n - 1).add(fib2(n - 2)));
        }
        return memo.get(n);
    }

    public static void main(String[] args) {
        int n = 30; 

       
        long startTime1 = System.nanoTime();
        BigInteger result1 = fib1(n);
        long endTime1 = System.nanoTime();
        long duration1 = endTime1 - startTime1;

       
        long startTime2 = System.nanoTime();
        BigInteger result2 = fib2(n);
        long endTime2 = System.nanoTime();
        long duration2 = endTime2 - startTime2;

      
        System.out.println("fib1(" + n + ") = " + result1 + ", Verlaufzeit: " + duration1 + " ns");
        System.out.println("fib2(" + n + ") = " + result2 + ", Verlaufzeit: " + duration2 + " ns");
    }
}

