import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class IsPrime

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();

        BigInteger bigInteger = new BigInteger(n);
        System.out.println(bigInteger.isProbablePrime(1) ? "prime" : "not prime");
        // Uses the Miller-Rabin primality test, which is an algorithm for testing the primality of a number.
        // We call the function by .isProbablePrime(1) and pass the number of rounds as the parameter.

    }
}
