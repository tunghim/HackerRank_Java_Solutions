import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<Integer> L = new ArrayList<Integer>();
        for(int i = 0; i < N; i++) {
            L.add(i, scan.nextInt());
        }
        int Q = scan.nextInt();
        for(int i = 0; i < Q; i++) {
            String query = scan.next();
            if(query.equals("Insert")) {
                int x = scan.nextInt();
                int y = scan.nextInt();
                L.add(x, y);
            } else {
                int x = scan.nextInt();
                L.remove(x);
            }
        }
        for(int item : L) {
            System.out.print(item + " ");
        }
    }
}