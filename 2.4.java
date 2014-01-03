import java.util.LinkedList;

class solution{
	public static void main(String[] args){
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i = 10; i >-1; i--){
			list.add(i);
		}
		System.out.println(list);
		LinkedList<Integer> newList = partition(list,5);
		System.out.println(newList);
	}

	public static LinkedList<Integer> partition(LinkedList<Integer> list, int parPoint){
		LinkedList<Integer> before = new LinkedList<Integer>();
		LinkedList<Integer> after = new LinkedList<Integer>();

		for(int i = 0; i < list.size(); i++){
			if(list.get(i) >= parPoint)
				after.add(list.get(i));
			else
				before.add(list.get(i));
		}

		before.addAll(after);
		return before;
	}
}
