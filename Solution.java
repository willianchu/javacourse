import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
            }
            System.out.println("================================");

    }
}

// #################################################
// Clear Buffer catch
//
// import java.util.Scanner;

// public class Solution {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int i = scan.nextInt();
//         double d = scan.nextDouble();
//         scan.nextLine(); // this is to clear the buffer
//         String s = scan.nextLine();
//         System.out.println("String: " + s);
//         System.out.println("Double: " + d);
//         System.out.println("Int: " + i);
//     }
// }



// ###########################################
// if-else/ remainder/ and/or
//	
// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.regex.*;

// public class Solution {



//     private static final Scanner scanner = new Scanner(System.in);

//     public static void main(String[] args) {
//         int N = scanner.nextInt();
//         scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//         scanner.close();
        
//         if(N%2>0 || (N<=20 && N>=6)){
//             System.out.println("Weird");
//         } else {
//             System.out.println("Not Weird");
//         }
        
        
//     }
// }


// ############################################
// Scan input from STDIN. Print output to STDOUT
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int a = scan.nextInt();
//         int b = scan.nextInt();
//         int c = scan.nextInt();

//         System.out.println(a);
//         System.out.println(b);
//         System.out.println(c);
//     }
// }