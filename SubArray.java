import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubArray {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        in.close();
        // count the number of sub-arrays with negative sum
        int count = 0;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += arr[j];
                System.out.printf("sum: %d, arr[%d]: %d", sum, j, arr[j]);
                System.out.println();
                if(sum < 0){
                    count++;
                }
            }
        }
        System.out.println(count);
        // print the array with all sub arrays combinations
        // for(int i = 0; i < n; i++){
        //     for(int j = i; j < n; j++){
        //         for(int k = i; k <= j; k++){
        //             System.out.print(arr[k] + " ");
        //         }
        //         System.out.println();
        //     }
        // }

    }
}


// FOR LOOP - {1,2,3,4,5}
// {
//     {1},
//     {1,2},
//     {1,2,3},
//     {1,2,3,4},
//     {1,2,3,4,5},
//     {2},
//     {2,3},
//     {2,3,4},
//     {2,3,4,5},
//     {3},
//     {3,4},
//     {3,4,5},
//     {4},
//     {4,5},
//     {5}
// }