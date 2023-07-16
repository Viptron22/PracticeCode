package loopPractice;

public class Pattern4 {
    public static void main(String[] args){
        int i,j,count=0;
        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++){
//               if(count<10)
//                System.out.print(++count+"  ");
//             else
//                 System.out.print(++count+" ");
                System.out.format("%02d ",++count);       //it reserves 2 digit space for output number

            }System.out.println();
        }
    }
}
