
package module11;
import java.util.*;
class MinStack {
    

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    void push(int val) {

        stack.push(val);

        if(minStack.isEmpty() || val <= minStack.peek())
            minStack.push(val);
    }

    void pop() {

        if(stack.pop().equals(minStack.peek()))
            minStack.pop();
    }

    int top() {
        return stack.peek();
    }

    int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {

        MinStack s = new MinStack();

        s.push(3);
        s.push(5);
        s.push(2);
        s.push(1);

        System.out.println("Minimum: " + s.getMin());

        s.pop();

        System.out.println("Top: " + s.top());
        System.out.println("Minimum: " + s.getMin());
    }
}

