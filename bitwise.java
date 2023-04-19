public class bitwise {
    public static void main(String[] args) {
    //     int n=6;
    //     if((n&1)==0)
    //     System.out.println("Even");
    //     else
    //     System.out.println("odd");
    // }
    // int a=5,b=5;
    // System.out.println(a^b);
    int n=8;int pos=4;int mask=1;
    mask=mask<<(pos-1);
    System.out.println(mask);

    if((n&mask)!=0)
    System.out.println("Set");
    else
    System.out.println("Unset");
    }
}