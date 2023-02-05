import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static boolean isPrime(String n) {
        BigInteger bigInteger = new BigInteger(n);
        Boolean flag = true;
        for(int i = 2; i < bigInteger.intValue(); i++) {
            if(bigInteger.intValue() % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) throws IOException {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

      String n = bufferedReader.readLine();

      System.out.println(isPrime(n) ? "prime" : "not prime");

      bufferedReader.close();
  }
}

        // BigInteger bigInteger = new BigInteger(n);
        // System.out.println(bigInteger.isProbablePrime(1) ? "prime" : "not prime");

        // // Uses the Miller-Rabin primality test, which is an algorithm for testing the primality of a number.
        // // We call the function by .isProbablePrime(1) and pass the number of rounds as the parameter.
