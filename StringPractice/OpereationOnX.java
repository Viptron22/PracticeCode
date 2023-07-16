package StringPractice;

public class OpereationOnX {
    public static int finalValueAfterOperations(String[] operations) {
        int x=0;

        for(String st:operations)
        {
           st= st.toLowerCase();
            switch(st){
                case "++x"->++x;
                case "x++"->x++;
                case "--x"->--x;
                case "x--"->x--;
            }
        }
        return x;
    }

   public static void main(String[] args){

        String[] operat={"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operat));
    }
}
