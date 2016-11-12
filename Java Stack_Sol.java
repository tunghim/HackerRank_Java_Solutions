import java.util.*;

class Solution{
    
    static boolean isBalanced(String input) {
        Stack<String> stack = new Stack<String>();
        boolean isBalanced = false;
        
        for(int i = 0; i < input.length(); i++) {
            String str = Character.toString(input.charAt(i));
            if(str.equals("(") || str.equals("[") || str.equals("{")) {
                stack.push(str);
            }
            if(str.equals(")") || str.equals("]") || str.equals("}")) {
                if(stack.isEmpty()) {
                    return false;
                }
                String opening = stack.peek();
                if(opening.equals("(") && str.equals(")")) {
                    stack.pop();
                }
                if(opening.equals("[") && str.equals("]")) {
                    stack.pop();
                }
                if(opening.equals("{") && str.equals("}")) {
                    stack.pop();
                }
            }
        }
        if(input.length() > 0 && stack.isEmpty()) {
            isBalanced = true;
        }
        
        return isBalanced;
    }    
   
    public static void main(String []argh) {
        Scanner sc = new Scanner(System.in);
      
        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            if(isBalanced(input)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
