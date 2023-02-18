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
        // creating sub arrays
        int[][] subArrays = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                subArrays[i][j] = a[j];
            }
        }
        // sum of sub arrays
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += subArrays[i][j];
                if (sum < 0) {
                    System.out.println(sum);
                }
            }
        }
    }
}
