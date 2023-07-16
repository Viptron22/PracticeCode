package StringPractice;

public class SwappTwoStringsWIthoutThird {
    public static void main(String[] args) {
        String first="vidya";
        String second="dhar";
        first=first+","+second;
        second=first+","+second;
        first=first.substring(first.indexOf(',')+1,first.length());
        second=second.substring(0,second.indexOf(','));

        System.out.println(first+","+second);
    }
}
