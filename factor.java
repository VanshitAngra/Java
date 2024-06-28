import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        for(int i=2;i<=n;i++){
            while(n%i==0)
            {
                if(n-i==0)
                System.out.print(i);
                else
                System.out.print(i+" ");
                n/=i;
            }
        }
        ob.close();
    
    }
}
