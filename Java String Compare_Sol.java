import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        SortedSet<String> substrs = new TreeSet<String>();
        for(int i = 0; i <= s.length() - k; i++) {
            substrs.add(s.substring(i, i + k));
        }
        System.out.println(substrs.first());
        System.out.println(substrs.last());
    }
}