import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubArray {

    public static void main(String[] args) {
        Scanner elementsNumber = new Scanner(System.in);
        int n = elementsNumber.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int val = elementsNumber.nextInt();
            a[i] = val;
        }
        elementsNumber.close();
        // Prints each sequential element in array a
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                System.out.println("i: " + i + " j: " + j);
            }
        }
    }
}
