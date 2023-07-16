package arrayPractice;

public class arrayEvenOdd {
    public static void main(String[] args) {
      int [] arr={12,345,2,6,7896};
      int eve=evenOddDigitArray2(arr);
        System.out.println(eve);

    }

    static String evenOddDigitInArray(int[] arr){
          int count=0;
          String even="";
          for(int i:arr){
              count=0;
              if(i==1||i==0){
                  count=count+1;
              } int temp=i;
              while(temp>0){

                  temp=temp/10;
              count++;
              }if(count%2==0){
                  System.out.println(arr[i]+" contains "+count+" digits (even number of digits)");
                  even=even+","+String.valueOf(i);
              }
                else{
                  System.out.println(arr[i]+" contains "+count+" digits (odd number of digits)");

              }
          }
      return even;
    }

    //optimised way
    static int evenOddDigitArray2(int[] arr){
        int count=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            count=digitCount(arr[i]);
        if(count%2==0){
            System.out.println(arr[i]+" contains "+count+" digits (even number of digits)");
            ans++;

        }
        else{
            System.out.println(arr[i]+" contains "+count+" digits (odd number of digits)");

        }
    }return ans;}
    static int digitCount(int num){
        int count=0;
        count =(int)(Math.log10(num))+1;
        return count;
    }

}
