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
        
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < n; j++){
                for(int k = j; k < j + i; k++){
                    if(k < n){
                        System.out.print(a[k] + " ");
                    }
                }
            }
        }
    }
}
