import java.io.*;
import java.util.*;

public class Solution {
    static boolean isAnagram(String a, String b) {
        
        // Complete the function by writing your code here.
        char[] A = a.toUpperCase().toCharArray();
        char[] B = b.toUpperCase().toCharArray();
        Arrays.sort(A);
        Arrays.sort(B);
        return Arrays.equals(A, B);
    }
    
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
