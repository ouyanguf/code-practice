
class solution {
	public static void main(String[] args){
    	isUniqueChars(args[0]);
    }

	public static boolean isUniqueChars(String input){
		boolean[] checker = new boolean[256];
		for(int i=0; i<input.length();i++){
			int charVal = input.charAt(i);
			if(checker[charVal] == true){
				System.out.println("Not Unique!");
				return false;
			}
			checker[charVal] = true;
		}
		System.out.println("All Unique!");
		return false;
	}
}
