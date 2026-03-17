
package module11;
import java.util.*;
public class ReversePolishNotation {
 
public static void main(String[] args) {

        String[] tokens = {"2","1","+","3","*"};

        Stack<Integer> stack = new Stack<>();

        for(String t : tokens){

            if(t.equals("+")){
                stack.push(stack.pop() + stack.pop());
            }
            else if(t.equals("-")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);
            }
            else if(t.equals("*")){
                stack.push(stack.pop() * stack.pop());
            }
            else if(t.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a / b);
            }
            else{
                stack.push(Integer.parseInt(t));
            }
        }

        System.out.println(stack.pop());
    }
} 

