// #######################################
// Java substring exclusive
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start, end));
        // end is exclusive
    }
}

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


