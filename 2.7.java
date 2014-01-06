import java.util.LinkedList;
import java.util.Stack;
import java.util.Collections;

class Solution{
    public static void main(String[] args){
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        for(int i = 0; i<10; i++){
            list1.addFirst(i);
            list1.add(i);
        }
        list1.add(10,10);
        System.out.println(list1);
        System.out.println(isPalindrome1(list1));
        System.out.println(isPalindrome2(list1));
        list1.add(-1);
        System.out.println(list1);
        System.out.println(isPalindrome1(list1));
        System.out.println(isPalindrome2(list1));
    }

    public static boolean isPalindrome1(LinkedList<Integer> list){
        LinkedList<Integer> reList = (LinkedList<Integer>)list.clone();
        Collections.reverse(reList);
        //System.out.println(list+"\n"+reList);
        return list.equals(reList);
    }

    public static boolean isPalindrome2(LinkedList<Integer> list){
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i<(int)list.size()/2;i++){
            stack.push(list.get(i));
        }

        for(int i = list.size()%2>0 ? (int)list.size()/2+1 : (int)list.size()/2;i<list.size();i++){
            if(stack.pop()!=list.get(i))
                return false;
        }
        return true;
    }
}
