package arrayPractice;

public class InsertElementInArray {
    public static void main(String[] args){
        int A[]=new int[]{1,2,3,4,5,0,0,0,0,0};
        int n=5,temp=A[3],e=8;//e is the element user want to insert and n is the number of elements in the array
        for(int x:A){
            System.out.print(x+",");
        }System.out.println("after inserting elemnt at index 3");
        for(int i=n;i>3;i--){              //i>3 where 3 is the index where user wants to insert the element
            A[i]=A[i-1];
        }A[3]=e;
        for(int x:A){
            System.out.print(x+",");
        }




    }
}
