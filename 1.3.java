class solution {
	public static void main(String[] args){
		if(permutation(args[0],args[1]))
			System.out.println("Yes");	
		else
			System.out.println("No");
	}

	public static boolean permutation(String s1, String s2){
		int[] letters = new int[256];
		for(int i=0;i<s1.length();i++){
			letters[(int)s1.charAt(i)]++;
		}
		for(int i=0;i<s2.length();i++){
			if(--letters[(int)s2.charAt(i)]<0)
				return false;
		}
		return true;
	}
}
