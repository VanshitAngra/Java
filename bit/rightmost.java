package bit;

public class rightmost {
    public static void main(String[] args) {
        int n=4;
        int mask=1;
        int pos=1;
        while(mask!=0)
        {
            if((n&mask)!=0)
            break;
            pos++;
            mask<<=1;
        }
        System.out.println(pos);
    }
}
