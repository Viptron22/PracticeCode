package loopPractice;
//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15
public class Pattern9 {
    public static void main(String[] args){
        int i,j,counter=0,n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(++counter+" ");
            }System.out.println();
        }

    }
}
