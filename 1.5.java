class solution{
	public static void main(String[] args){
		String str1 = "aabcccddddeefffffff";
		String str2 = "aabcdef";
		System.out.println(strCompression(str1));
		System.out.println(strCompression(str2));
	}	

	public static String strCompression(String str){
		int newLength = getNewLength(str);
		if(newLength >= str.length())
			return str;

		StringBuffer sb = new StringBuffer();
		char last = str.charAt(0);
		int count = 1;
		for(int i=1;i<str.length();i++){
			if(str.charAt(i)==last){
				count++;
			}else{
				sb.append(last);
				sb.append(count);
				last = str.charAt(i);
				count = 1;
			}
		}
		sb.append(last);
		sb.append(count);
		return sb.toString();
	}

	public static int getNewLength(String str){
		char last = str.charAt(0);
		int count = 1;
		int size = 0;
		for(int i = 1; i < str.length(); i++){
			if(str.charAt(i)==last){
				count++;
			}else{
				size += 1 + String.valueOf(count).length();
				last = str.charAt(i);
				count = 1;
			}
		}
		size += 1 + String.valueOf(count).length();
		return size;
	}
}

