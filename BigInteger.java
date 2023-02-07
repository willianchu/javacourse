import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigInteger {

    public static void main(String[] args) {
        // retrieving two args from the command line
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        // adding the two args
        BigInteger ResultSum = a.add(b);
        // multiplying the two args
        BigInteger ResultMultiply = a.multiply(b);
        // printing the results
        System.out.println(ResultSum);
        System.out.println(ResultMultiply);
        // closing the scanner
        sc.close();
    }
}