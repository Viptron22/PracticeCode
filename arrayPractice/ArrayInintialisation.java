package arrayPractice;

public class ArrayInintialisation {
    public static void main(String[] args) {
        int A[] = new int[10];  //intializing array
        int B[] = {1, 2, 3, 4, 5};
        System.out.println(B[2]);// printing element in array at index 2
        for (int x : B) {
            System.out.println(x);          //reading array b[] using for each loop ,for each loop is only used to read array
            //System.out.println(x++)  will not increment value of array art each index,as it reads only value directly
        }
        for(int j=0;j<B.length;j++){
            System.out.print(++B[j] +",");//this will print the value of element at index pre incremented

        }
         System.out.println();
        for (int i = 0; i < A.length; i++) {  //A.length is a property of array not a method
            //System.out.println(A[i]); //by default the values are zero
            System.out.print(A[i]+","); //this will the value at the index
        }
    }
}