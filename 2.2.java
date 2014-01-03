import java.util.*;

class solution{
	public static void main(String[] args){
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i=100;i>0 ; i--){
			list.add(i);
		}
		int result = nthToLast(list, 10);
		System.out.println(result);
	}

	public static int nthToLast(LinkedList<Integer> list, int n){
		if(list.size()==0){
			System.out.println("Error: Size = 0");
			return -1;
		}

		Iterator<Integer> it = list.iterator();
		int index1 = 0;
		int index2 = 0;
		while(it.hasNext()){
			index1++;
			it.next();
			//System.out.println(index1+" "+index2);
			if(index1>n)
				index2++;
		}
		return list.get(index2);
	}
}

