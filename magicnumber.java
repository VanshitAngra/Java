//75 to be done

public class magicnumber {
    public static void main(String[] args) {
        int n=5;
        int ans=0;
        int mul=5;
        while(n!=0)
        {
            if((n&1)!=0)
            ans+=mul;
            n>>=1;
            mul*=5;
        }
        System.out.println(ans);
    }
}
