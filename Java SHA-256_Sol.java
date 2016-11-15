import java.io.*;
import java.util.*;
import java.security.MessageDigest;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try {
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            for(byte b : MessageDigest.getInstance("SHA-256").digest(s.getBytes())) {
                System.out.printf("%02x", b);
            }
        } catch(Exception e) {}
    }
}