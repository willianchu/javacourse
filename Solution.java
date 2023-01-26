// ################################################
// Java Int to String

import java.util.*;
import java.security.*;
public class Solution {
 public static void main(String[] args) {

  DoNotTerminate.forbidExit();

  try {
   Scanner in = new Scanner(System.in);
   int n = in .nextInt();
   in.close();
   
   String s = String.valueOf(n);
    
   if (n == Integer.parseInt(s)) {
    System.out.println("Good job");
   } else {
    System.out.println("Wrong answer.");
   }
  } catch (DoNotTerminate.ExitTrappedException e) {
   System.out.println("Unsuccessful Termination!!");
  }
 }
}

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

 public static class ExitTrappedException extends SecurityException {

  private static final long serialVersionUID = 1;
 }

 public static void forbidExit() {
  final SecurityManager securityManager = new SecurityManager() {
   @Override
   public void checkPermission(Permission permission) {
    if (permission.getName().contains("exitVM")) {
     throw new ExitTrappedException();
    }
   }
  };
  System.setSecurityManager(securityManager);
 }
}

// ################################################
// Java Static Initializer Block
// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

// public class Solution {

// private static boolean flag; 
// private static int B;
// private static int H;

// // static initialization block - runs before main
// static{
//     Scanner sc = new Scanner(System.in);
//     B = sc.nextInt();
//     H = sc.nextInt();
//     sc.close();
//     if(B>0 && H>0){
//         flag = true;
//     }else{
//         System.out.println("java.lang.Exception: Breadth and height must be positive");
//     }
// }

// public static void main(String[] args){
// 		if(flag){
// 			int area=B*H;
// 			System.out.print(area);
// 		}
		
// 	}//end of main

// }//end of class



// ################################################
// End of File
// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

// public class Solution {

//     public static void main(String[] args) {
//         int line_counter = 0;
//         Scanner scan = new Scanner(System.in);
//         while(scan.hasNext()){
//             line_counter++;
//             System.out.println(line_counter + " " + scan.nextLine());
//         }
        
//         scan.close();
//     }
// }


// ###############################################
// Size of byte, short, int, long
// import java.util.*;
// import java.io.*;



// class Solution{
//     public static void main(String []argh)
//     {



//         Scanner sc = new Scanner(System.in);
//         int t=sc.nextInt();

//         for(int i=0;i<t;i++)
//         {

//             try
//             {
//                 long x=sc.nextLong();
//                 System.out.println(x+" can be fitted in:");
//                 if(x>=-128 && x<=127)System.out.println("* byte");
//                 if(x>=-32768 && x<=32767)System.out.println("* short");
//                 if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
//                 if(x>=-9223372036854775808L && x<=9223372036854775807L)System.out.println("* long");

//             }
//             catch(Exception e)
//             {
//                 System.out.println(sc.next()+" can't be fitted anywhere.");
//             }

//         }
//     }
// }




// ##############################################################
// Math and String manipulation
// import java.util.*;
// import java.io.*;
// import java.lang.Math;

// class Solution{
//     public static void main(String []argh){
//         Scanner in = new Scanner(System.in);
//         int t=in.nextInt();
//         for(int i=0;i<t;i++){
//             int a = in.nextInt();
//             int b = in.nextInt();
//             int n = in.nextInt();
//             int acumulator = a;
//             for(int j=0;j<n;j++){
//                 acumulator += (int) Math.pow(2,j)*b;
//                 System.out.print(acumulator+" ");
//             }
//             System.out.println();
//         }
//         in.close();
        
//     }
// }

// #####################################################
// Loops and Format output 

// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.regex.*;
// public class Solution {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); // read input from STDIN

//         int N = Integer.parseInt(bufferedReader.readLine().trim()); // trim() removes leading and trailing whitespace
//         bufferedReader.close(); // close the buffer
//         for(int i=1; i<=10; i++){
//             System.out.format("%d x %d = %d%n", N, i, N*i);
//         }
//     }
// }


// #################################################### 
// formating output

// import java.util.Scanner;

// public class Solution {

//     public static void main(String[] args) {
//             Scanner sc=new Scanner(System.in);
//             System.out.println("================================");
//             for(int i=0;i<3;i++){
//                 String s1=sc.next();
//                 int x=sc.nextInt();
//                 System.out.format("%-15s%03d%n", s1, x); 
//                 // %s is for string, %d is for integer, %n is for new line	
//             }
//             System.out.println("================================");

//     }
// }

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