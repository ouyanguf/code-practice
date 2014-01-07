import java.util.Stack;

class stackWithMin extends Stack<Integer>{
    Stack<Integer> stack;

    stackWithMin(){
        stack = new Stack<Integer>();
    }

    public Integer push(Integer i){
        super.push(i);
        if(i<=min())
            stack.push(i);
        return i;
    }

    public Integer pop(){
        int val = super.pop();
        if(val==min())
            stack.pop();
        return val;
    }

    public int min(){
        if(stack.empty())
            return Integer.MAX_VALUE;
        return stack.peek();
    }
}
