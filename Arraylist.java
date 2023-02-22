import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arraylist {

    public static void main(String[] args) {
        /* Array List - Dynamic size array */
        /* Dynamic Array 2D */
        /* Array List of Array List */
        Scanner scan = new Scanner(System.in);
        int arrayLines = scan.nextInt();
        ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < arrayLines; i++) {
            int arrayElements = scan.nextInt();
            ArrayList<Integer> arrayLine = new ArrayList<Integer>();
            for (int j = 0; j < arrayElements; j++) {
                int arrayElement = scan.nextInt();
                arrayLine.add(arrayElement);
            }
            array.add(arrayLine);
        }
    }
}

// INPUT
// 5 (number of lines)
// 5 41 77 74 22 44 (5 elements in the first line)
// 1 12 (1 element in the second line)
// 4 37 34 36 52 (4 elements in the third line)
// 0 (0 elements in the fourth line)
// 3 20 22 33 (3 elements in the fifth line)
// 5 (number of queries)
// 1 3 (1st query: find the 3rd element in the 1st line)
// 3 4 (2nd query: find the 4th element in the 3rd line)
// 3 1 (3rd query: find the 1st element in the 3rd line)
// 4 3 (4th query: find the 3rd element in the 4th line)
// 5 5 (5th query: find the 5th element in the 5th line)