import java.util.*;
import java.io.*;

class Solution{
    public static void series(int a, int b, int n) {
        int res = a;
        for(int i = 0; i < n; i++) {
            res += Math.pow(2, i) * b;
            System.out.print(res + " ");
        }
    }
    
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            series(a, b, n);
            System.out.println();
        }
        in.close();
    }
}
