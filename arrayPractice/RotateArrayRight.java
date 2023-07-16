package arrayPractice;

public class RotateArrayRight {
    public static void main(String[] args){
        int A[]={1,1,2,3,4,54};
        int temp=A[5];
        for(int x:A){
            System.out.print(x+",");

        }System.out.println();
        for(int i=A.length-1;i>0;i--){
            A[i]=A[i-1];
        }A[0]=temp;
        for(int y:A){
            System.out.print(y+",");
        }


    }
}
