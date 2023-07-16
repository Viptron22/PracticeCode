package loopPractice;

public class Pateern3 {
    public static void main(String[] args){
        int i,j;
        for(i=1;i<=5;i++){
            for(j=i+1;j<=5+i;j++){      //for(j=1;j<=5;j++)
                System.out.print(j+" ");//or print(i+j+" ")
            }System.out.println();
        }
    }
}
