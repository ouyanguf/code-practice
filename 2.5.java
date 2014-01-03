import java.util.LinkedList;

class solution{
	public static void main(String[] args){
		LinkedList<Integer> n1 = new LinkedList<Integer>();
		LinkedList<Integer> n2 = new LinkedList<Integer>();
		n1.add(6);//946
		n1.add(4);
		n1.add(9);
		n2.add(9);//6619
		n2.add(1);
		n2.add(6);
		n2.add(6);
		LinkedList<Integer> nl = addLists(n1,n2);
		System.out.println(nl);
	}
	
	public static LinkedList<Integer> addLists(LinkedList<Integer> n1, LinkedList<Integer> n2){
		int carry = 0;
		int index1 = 0;
		int index2 = 0;
		LinkedList<Integer> newList = new LinkedList<Integer>();

		while(index1<n1.size() || index2<n2.size() || carry!=0){
			int value = carry;
			if(index1<n1.size()){
				value += n1.get(index1);
				index1++;
			}
			if(index2<n2.size()){
				value += n2.get(index2);
				index2++;
			}
			newList.add(value%10);
			carry = value>=10 ? 1 : 0;
		}

		return newList;
	}
}

