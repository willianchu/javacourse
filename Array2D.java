import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Array2D {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        bufferedReader.close(); 

        int DIMENSION = 6 - 2;

        int maxSum = 0; // initialize to 0 but if the first hourglass is negative, this will be wrong!!!

        for (int i = 0; i < DIMENSION; i++) {
            int currentSum = 0;
            for (int j = 0; j < DIMENSION; j++) {
                currentSum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) + arr.get(i + 1).get(j + 1) + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                if (currentSum > maxSum || i == 0 && j == 0) {
                    maxSum = currentSum;
            }
          }
        System.out.println(maxSum);
    }
}

