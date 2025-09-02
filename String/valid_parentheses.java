public class Solution {
    public boolean isValid(String s) {
        // Use an array as a stack
        char[] stack = new char[s.length()];
        int top = -1; // Stack pointer
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(' || c == '{' || c == '[') {
                // Push opening brackets onto the stack
                stack[++top] = c;
            } else {
                // If stack is empty or top of stack doesn't match the closing bracket, return false
                if (top == -1) {
                    return false;
                }
                char topChar = stack[top--];
                if ((c == ')' && topChar != '(') || 
                    (c == '}' && topChar != '{') || 
                    (c == ']' && topChar != '[')) {
                    return false;
                }
            }
        }
        
        // If stack is empty, all brackets were matched correctly
        return top == -1;
    }
}    
