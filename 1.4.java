class solution{
	public static void main(String[] args){
		String str = "a sd  f           ";
		int length = 8;
		char[] charArray = str.toCharArray();
		System.out.println(charArray);
		replaceSpaces(charArray,length);
		System.out.println(charArray);
	}

	public static void replaceSpaces(char[] str, int length){
		int spaceCount = 0;
		for(int i=0;i<length;i++){
			if(str[i] == ' ')
				spaceCount++;
		}
		int newLength = length + (spaceCount*2);
		str[newLength]='\0';
		for(int i= length-1;i>=0;i--){
			if(str[i]==' '){
				str[--newLength]='0';
				str[--newLength]='2';
				str[--newLength]='%';
			}else{
				str[--newLength]=str[i];
			}

		}
	}
}
