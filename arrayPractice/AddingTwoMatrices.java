package arrayPractice;
import java.util.*;


public class AddingTwoMatrices {
    static void addMatrix(int[][] arr1, int[][] arr2){
        int[][] arr3 = new int[arr1.length][arr1[0].length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
                System.out.format("%02d ",arr3[i][j]);
            }System.out.println();
        }


    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] a =new int[3][3];
        int[][] b ={{1,2,3},{4,5,6},{7,8,9}};
     //   int c[][]=new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){               //taking values of array a from user how are you my friend there is nothing to told you iam fine here

                a[i][j]=sc.nextInt();



            }System.out.println();
        }System.out.println("the sum of two matrices a and b are:=");
        addMatrix(a,b);
    }
}
