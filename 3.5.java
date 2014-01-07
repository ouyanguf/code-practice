import java.util.Stack;

class Solution<T>{
    public static void main(String[] args){
        Solution<Integer> queue = new Solution<Integer>();
        for(int i = 0 ; i < 10 ; i++){
            queue.add(i);
        }
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(queue.remove());
        }
        System.out.println(queue.peek());
    }

    Stack<T> oldStack;
    Stack<T> newStack;

    public Solution(){
        oldStack = new Stack<T>();
        newStack = new Stack<T>();
    }

    public void add(T value){
        newStack.add(value);
    }

    public T remove(){
        stackShift();
        return oldStack.pop();
    }

    public T peek(){
        stackShift();
        return oldStack.peek();
    }

    private void stackShift(){
        if(oldStack.empty()){
            while(!newStack.empty()){
                oldStack.push(newStack.pop());
            }
        }
    }
}

