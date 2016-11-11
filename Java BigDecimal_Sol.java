import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        //Write your code here
        for(int i = 0; i < n-1; i++) {
            int pointer = i;
            BigDecimal I = new BigDecimal(s[i]);
            for(int j = i+1; j < n; j++) {
                BigDecimal J = new BigDecimal(s[j]);
                if(I.compareTo(J) < 0) {
                    I = J;
                    pointer = j;
                }    
            }
            String temp = s[i];
            s[i] = s[pointer];
            s[pointer] = temp;
        }
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}