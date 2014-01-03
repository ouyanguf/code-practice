import java.util.*;

class solution{
	public static void main(String[] args){
		LinkedList<Integer> n1 = new LinkedList<Integer>();
		LinkedList<Integer> n2 = new LinkedList<Integer>();
		//int[] a1 = {1,2,3};
		n1.add(1);
		n1.add(2);
		n1.add(4);

		n2.add(9);//9916
		n2.add(9);
		n2.add(1);
		n2.add(6);
		
		System.out.println(addLists(n1,n2));

	}

	public static LinkedList<Integer> addLists(LinkedList<Integer> n1, LinkedList<Integer> n2){
		if(n1.size()>n2.size()){
			for(int i=0;i<n1.size()-n2.size();i++){
				n2.addFirst(0);
			}
		}

		if(n1.size()<n2.size())
			for(int i=0; i<n2.size()-n1.size();i++)
				n1.addFirst(0);

		ResultWrap result = partialAdd(n1,n2,0);
		if(result.carry>0)
			result.list.addFirst(result.carry);
		return result.list;
	}

	public static class ResultWrap{
		int carry = 0;
		LinkedList<Integer> list = new LinkedList<Integer>();
	}

	public static ResultWrap partialAdd(LinkedList<Integer> n1, LinkedList<Integer> n2, int index){
		if(index==n1.size()-1){
			ResultWrap result = new solution.ResultWrap();
			int value = n1.get(index)+n2.get(index);
			result.list.addFirst(value%10);
			result.carry = value>=10 ? 1 : 0;
			return result;
		}

		ResultWrap result = partialAdd(n1,n2,index+1);
		int value = result.carry + n1.get(index) + n2.get(index);
		result.list.addFirst(value%10);
		result.carry = value>=10 ? 1 : 0;
		return result;
	}
}
		
