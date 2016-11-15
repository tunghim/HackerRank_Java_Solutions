import java.io.*;
import java.util.*;

interface PerformOperation {
	boolean check(int a);
}

class MyMath {
	public static boolean checker(PerformOperation p, int num) {
	return p.check(num);
	}
	
	// Solution
	PerformOperation is_odd() {
    	return (int a) -> a % 2 != 0;
	}

	PerformOperation is_prime() {
    	return a -> {
			for (int i = 2; i <= Math.sqrt(a); i++) {
				if (a % i == 0) {
					return false;
				}
			}
			return true;
    	};
	}

	PerformOperation is_palindrome() {
    	return a -> {
        	char[] charArr = String.valueOf(a).toCharArray();
	        int middleIndex = charArr.length / 2;
    	    for (int i = 0; i < middleIndex; i++) {
        	    if (charArr[i] != charArr[charArr.length - 1 - i]) {
            	    return false;
            	}
        	}
        	return true;
    	};
	}
}

public class Solution {

	public static void main(String[] args) throws IOException {
		MyMath ob = new MyMath();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PerformOperation op;
		boolean ret = false;
		String ans = null;
		while (T--> 0) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (ch == 1) {
				op = ob.is_odd();
				ret = ob.checker(op, num);
				ans = (ret) ? "ODD" : "EVEN";
			} else if (ch == 2) {
				op = ob.is_prime();
				ret = ob.checker(op, num);
				ans = (ret) ? "PRIME" : "COMPOSITE";
			} else if (ch == 3) {
				op = ob.is_palindrome();
				ret = ob.checker(op, num);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
			}
			System.out.println(ans);
		}
	}
}