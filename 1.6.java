class solution{
	public static void main(String[] args){
		int[][] matrix = { {1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Before:");
		printMatrix(matrix);
		rotate(matrix,3);
		System.out.println("After:");
		printMatrix(matrix);
	}

	public static void printMatrix(int[][] matrix){
		for(int i = 0; i<3;i++){
			for(int j = 0; j < 3; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void rotate(int[][] matrix,int edge){
		for(int layer = 0; layer < edge; layer++){
			int first = layer;
			int last = edge - 1 - first;
			for(int i = first; i<last;i++){
				int offset = i-first;

				int top = matrix[first][first+offset];
				matrix[first][first+offset] = matrix[last-offset][first];
				matrix[last-offset][first] = matrix[last][last-offset];
				matrix[last][last-offset] = matrix[first+offset][last];
				matrix[first+offset][last] = top;
			}
		}
	}
}
