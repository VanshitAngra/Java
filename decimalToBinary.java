import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner ob =new Scanner(System.in);
        int n=ob.nextInt();
        int e=0;
        double bin=0;
        while(n>0)
        {
            int r=n%2;
            bin+=(r*Math.pow(10,e));
            e++;
            n/=2;
        }
        System.out.println(bin);
    }
}
