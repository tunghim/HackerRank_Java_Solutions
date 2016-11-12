import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int M = sc.nextInt();
 
        final BitSet[] B = {new BitSet(N), new BitSet(N)};
        final StringBuilder sb = new StringBuilder();
 
        for (int i = 0; i < M; ++i) {
            final String operator = sc.next();
            final int o1 = sc.nextInt();
            final int o2 = sc.nextInt();
            switch (operator) {
                case "AND":
                    B[o1 - 1].and(B[o2 - 1]);
                    break;
                case "OR":
                    B[o1 - 1].or(B[o2 - 1]);
                    break;
                case "XOR":
                    B[o1 - 1].xor(B[o2 - 1]);
                    break;
                case "FLIP":
                    B[o1 - 1].flip(o2);
                    break;
                case "SET":
                    B[o1 - 1].set(o2);
                    break;
            }
            sb.append(B[0].stream().count()).append(" ").append(B[1].stream().count()).append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}