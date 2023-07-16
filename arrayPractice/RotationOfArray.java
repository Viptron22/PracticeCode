package arrayPractice;

public class RotationOfArray {
    public static void main(String[] args){
        int A[]={20,30,40,50,60};
        int B[]=new int[A.length];
        for(int i=A.length-1;i>=0;i--){
            B[i]=A[i];
            System.out.print(B[i]+",");
        }
    }
}
