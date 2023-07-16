package codeUsingMethod;
//method to perform addition and multiplication of two matrices of 2d
public class ArithmeticsOnMatrix {
	static void matrixArithmetic(int mat1[][],int mat2[][]) {
		int multi[][]=new int[mat1.length][mat2[0].length];
		int j;
		for(int i=0;i<multi.length;i++) {
			for( j=0;j<multi[0].length;j++) {
				multi[i][j]=0;
				for(int k=0;k< mat2.length;k++) {              //k will run to 0 to matrix 2 length -1
					multi[i][j]=multi[i][j]+mat1[i][k]*mat2[k][j];
				
			
			
		}

	}
		}
		for(int i=0;i<multi.length;i++){
			for(j=0;j<multi[0].length;j++){
				System.out.print(multi[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	    public static void main(String[] args) {

	    	int mat1[][]= {{1,2,3},{4,5,6}};
	        int mat2[][]={{1,0,0},{0,1,0},{0,0,1}};

	        System.out.println("the multiplication of two matrices is=");
	        matrixArithmetic(mat1,mat2);

}
}

