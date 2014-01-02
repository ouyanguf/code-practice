class solution{
	public static void main(String[] args){
		int[][] matrix = {{0,1},{1,1}};
		setZeros(matrix);
		for(int i = 0; i<2;i++){
			for(int j = 0; j<2;j++)
				System.out.print(matrix[i][j]+" ");
			System.out.println();
		}
	}

	static void setZeros(int[][] matrix){
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];

		for(int i = 0; i<2;i++){
			for(int j = 0; j<2;j++)
				if(matrix[i][j] == 0){
					row[i]=true;
					column[j]=true;
				}
		}
		
		for(int i = 0; i<2;i++){
			for(int j = 0; j<2;j++)
				if(row[i]||column[j]){
					matrix[i][j] = 0;
				}
		}
		
	}
}
