import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        while(n>1)
        {
            for(int i=2;i<=n;i++)
            {
                if(n%i==0)
                {
                    System.out.print(i+" ");
                    n/=i;
                } 
            }
        }
    }
}
