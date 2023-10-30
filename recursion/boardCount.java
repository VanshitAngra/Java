//
package recursion;

public class boardCount {
    static void outcome(int n,String ans,int f)
    {
        if(n==0)
        {
            System.out.println(ans);
            return;
        }
        if(n<0)
        return;
        // outcome(n-1, ans+"1");
        // outcome(n-2, ans+"2");
        // outcome(n-3, ans+"3");
        for(int i=1;i<=f;i++)
        {
            outcome(n-i, ans+i+"",f);
        }
    }
    public static void main(String[] args) {
        int n=4;
        int f=1;
        outcome(n,"");
        
    }
}
