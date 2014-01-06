import java.util.LinkedList;

public class Stack<T>{
    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop()+"\n"+stack.pop());
    }

    LinkedList<T> list = new LinkedList<T>();
    public void push(T t){
        list.push(t);
    }

    public T pop(){
        return list.pop();
    }
}
