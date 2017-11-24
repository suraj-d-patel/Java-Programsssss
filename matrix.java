class matrix{
	public static void main(String args[]){
		int[][] matrix= {	{1,2,3},
                            			{4,5,6},
                                                                           {7,8,9}
                                        		};
                int[][] result =new int[3][3];
	           System.out.println("Before operation Matrix was ");
	for(int i=0;i<matrix.length;i++){
		for(int j=0;j<matrix[i].length;j++){
			System.out.print(matrix[i][j]);
		}
                System.out.println();
	}
        
        //multiply with 3
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                result[i][j]=3*matrix[i][j];
            }
        }
       // multiply with 4
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                result[i][j]=4*matrix[i][j];
            }
        }
        
System.out.println("After operation Matrix was ");
	for(int i=0;i<matrix.length;i++){
		for(int j=0;j<matrix[i].length;j++){
			System.out.print(result[i][j] + " ");
		}
                System.out.println();
	}
        }
}