import java.util.Stack;

class Solution{
    public static Stack<Integer> sortStack(Stack<Integer> stack){
        Stack<Integer> sorted = new Stack<Integer>();
        while(!stack.empty()){
            int val = stack.pop();
            while(!sorted.empty()&&val<sorted.peek()){
                stack.push(sorted.pop());
            }
            sorted.push(val);
        }
        return sorted;
    }
}
