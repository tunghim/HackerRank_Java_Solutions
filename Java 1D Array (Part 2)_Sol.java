import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    static boolean isSolvable(int[] arr,int m, int currentPos,int lastJumpPos) {

        boolean OddsOfWinning = false;

        int steps = currentPos;
        // While still within the array and there is a road (no "1" immediately ahead), keep stepping forward.
        while(steps < arr.length - 1 && arr[steps + 1] != 1) {
            steps++;
        }
        // If we have reached the end of the array by simply stepping forward, we win. 
        if(steps == arr.length - 1) {
            return true;
        }
           
        // If there is no road ahead, we have to try a workaround by moving backward.
        int backSteps = steps;
        // As long as we are rewinding to a position after the last jump position, the position we stepping backward is steppable (not "1") and stepping backward plus a jump help us go further than a step, we will do it.
        while(backSteps > lastJumpPos && arr[backSteps - 1] == 0 && (backSteps + m) > steps + 1 ) {
            backSteps--;
        }
        
        // Reset current position.
        currentPos = backSteps;
        
        for(int i = currentPos; i <= steps; i++) {
            // If we are still inside the array after a jump, the position we jumping into is jumpable (not "1") and the jump length is not zero, we do a recursion (jump) with updated current and last jump position.
            if((i + m) < arr.length && arr[i + m] != 1 && m != 0) {
                OddsOfWinning = isSolvable(arr, m, i + m, i);
            }
            
            // Win if we are already one jump or one step ahead of getting out of the array.
            if(OddsOfWinning || (i + m) >= arr.length || (i + 1) >= arr.length) {
                OddsOfWinning = true;
                break;
            }
        }

        return OddsOfWinning;
    }
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i = 0; i < T; i++) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[] arr = new int[n];
            for(int j = 0; j < n; j++) {
                arr[j] = scan.nextInt();
            }
            if(isSolvable(arr, m, 0, 0)){
                    System.out.println("YES");
            } else {
                    System.out.println("NO");
            }
        }
    }
}