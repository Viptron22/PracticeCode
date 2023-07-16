package arrayPractice;

public class RotateArrayLeft {
    public static void main(String[] args){
        int A[]={1,2,3,4,5,6};
        int B[]=new int[A.length];
        int temp=A[0];
        for(int i=0;i<A.length;i++){
           for(int j=0;j<B.length;j++){
               if(j==B.length-1){
                   B[j]=A[0];}

              else{
             ++i;
               B[j]=A[i];}
           }


        }for(int x:B){
            System.out.print(x+",");
        }
    }
}
