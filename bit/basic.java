package bit;
//count number of ones
public class basic {
    public static void main(String[] args) {
        // System.out.println(-5>>1);
        int n=2;
        int mask=1;
        int c=0;
        while(mask!=0)
        {
            if((n&mask)!=0)
            c++;
            mask<<=1;
        }
        System.out.println(c);

    }
}
