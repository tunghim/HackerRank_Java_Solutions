import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        sc.close();
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Convert input String to an array of characters:
        char[] s = A.toCharArray();

        // Enqueue/Push all chars to their respective data structures:
        for(char c : s) {
            stack.push(c);
            queue.add(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for(int i = 0; i < s.length/2; i++) {
            if (stack.pop() != queue.remove()) {
                isPalindrome = false;                
                break;
            }
        }

        System.out.println(isPalindrome? "Yes" : "No");
    }
}
