package arrayPractice;

public class MatrixMultiplication {
    public static void main(String[] args){
        int a[][]={{1,2,3},{2,3,4},{5,6,7}};
        int b[][]={{1,0,0},{0,1,0},{0,0,1}};
        int c[][]=new int[3][3];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                for(int k=0;k<3;k++){
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];

                }System.out.format("%02d ",c[i][j]);
            }System.out.println();
        }
    }
}
