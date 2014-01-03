class solution{
	public static void main(String[] args){
		String s1 = "asdf";
		String s2 = "sdfa";
		if(isRotation(args[0],args[1]))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	public static boolean isRotation(String s1,String s2){
		if(s1.length()!=s2.length()||s2.length()==0)
			return false;
		if((s1+s1).contains(s2))
			return true;
		else
			return false;
	}
}
