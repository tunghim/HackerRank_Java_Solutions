import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++) {
            A[i] = scan.nextInt();
        }
        int numOfNegSubArr = 0;
        int sum;
        for(int i = 0; i < n; i++) {
            // Reset sum for each starting index.
            sum = 0;
            for(int j = i; j < n; j++) {
                sum = A[j] + sum;
                // Accumulate the number of -ve subarray.
                if(sum < 0) {
                    numOfNegSubArr++;
                }
            }
        }
        System.out.println(numOfNegSubArr);
    }
}