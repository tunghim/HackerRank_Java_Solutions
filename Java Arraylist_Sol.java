import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // Declare an arraylist of arraylists.
        ArrayList[] arrList = new ArrayList[n];
        for(int i = 0; i < n; i++) {
            int d = scan.nextInt();
            arrList[i] = new ArrayList();
            for(int j = 0; j < d; j++) {
                arrList[i].add(scan.nextInt());
            }
        }
        int q = scan.nextInt();
        for(int i = 0; i < q; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            try {
                System.out.println(arrList[x-1].get(y-1));
            } catch(Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}