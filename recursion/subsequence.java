package recursion;

public class subsequence {
    static int subseq(String s,String ans)
    {
        if(s.length()==0)
        {
            System.out.println(ans);
            return 1;
        }
     int a=subseq(s.substring(1), ans);
     int b=subseq(s.substring(1), ans+s.charAt(0));
    }
    public static void main(String[] args) {
        
    }
}
