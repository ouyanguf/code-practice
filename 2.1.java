import java.util.LinkedList;
import java.util.Hashtable;

class solution{
	public static void main(String args[]){
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(4);
		removeDups(list);
		System.out.println(list);
	}

	public static void removeDups(LinkedList<Integer> list){
		Hashtable<Integer,Boolean> table = new Hashtable<Integer,Boolean>();
		//Iterator<Integer> it = list.iterator();
		for(int i=0;i < list.size();i++){
			if(!table.containsKey(list.get(i))){
				table.put(list.get(i),true);
			}else{
				list.remove(i);
				i--;
			}
		}
	}
}
