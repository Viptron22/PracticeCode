package arrayPractice;
//SYNTAX,initialization of 2d array
public class TwoDimensionalArray {
    public static void main(String[] args){
       // int a[][]=new int[3][4];            //creating array with 3 rows and 4 columns(that is 4 elements)
          int[] b[]=new int[3][4];
          int[]d[],c;//c is 1d array and d is 2d array because it has two references int[ d,c;here both d and c are one d arrays
          int a[][]={{1,2,3,4},{5,6,7,8},{9,0,11,12}};
          //printing 2d array a using for loop
        for(int i=0;i<a.length;i++){            //because length of 2d array is no of rows ,
            for(int j=0;j<a[0].length;j++){//and here we take a[0] because it refers the length of row a0,1,2 have same element noi.e 4
                System.out.print(a[i][j]+",");
            }System.out.println();
        }
        //printing array b using for each loop
        for(int x[]:b){
            for(int y:x){                         //here x[is reference to rows i.e length of array and y:x to print the values in reference array x]
                System.out.print(y+",");

            }System.out.println();
        }

    }
}
