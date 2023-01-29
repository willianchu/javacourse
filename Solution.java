import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        int len = s.length();
        for(int i = 0; i < len - k + 1; i++) {
            String sub = s.substring(i, i + k);
            if(i == 0) {
                smallest = sub;
                largest = sub;
            } else {
                if(sub.compareTo(smallest) < 0) {
                    smallest = sub;
                }
                if(sub.compareTo(largest) > 0) {
                    largest = sub;
                }
            }
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

// #######################################
// Java substring exclusive
// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

// public class Solution {

//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         String S = in.next();
//         int start = in.nextInt();
//         int end = in.nextInt();
//         System.out.println(S.substring(start, end));
//         // end is exclusive
//     }
// }

// #######################################
// Java string manipulation

// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner(System.in);
//         String A=sc.next();
//         String B=sc.next();
        
//         System.out.println(A.length() + B.length());
//         System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
//         System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
        
//     }
// }


