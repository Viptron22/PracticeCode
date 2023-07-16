package StringPractice;

public class ReverseString {
    public static void main(String[] args) {
      String sen="My Name Is Vidyadhar";
        System.out.println(reverse(sen));
    }
    public static String reverse(String st)
    {
        String[] ns=st.split(" ");
        String rev="";
        for (int i=0;i<ns.length;i++)
        {
           rev=ns[i]+" "+rev;
        }
        return rev;
    }
    public static void swap(String[] str,int s,int e)
    {
       String temp=str[s];
       str[s].replace(str[s],str[e]+" ");
       str[e].replace(str[e],temp+" ");
    }
}
