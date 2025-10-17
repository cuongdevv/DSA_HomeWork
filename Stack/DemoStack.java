package Stack;

import java.util.Stack;

public class DemoStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(0);

        stack.pop();
        stack.pop();
        stack.peek();
        System.out.println("Stack: " + stack);
        
    }
}
