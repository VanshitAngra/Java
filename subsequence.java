import java.util.Scanner;

public class subsequence {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s="abc";
        int n=s.length();
        for (int i = 0; i <=n-1; i++) {
            for(int j=i;j<=n;j++)
            {
                System.out.print(s.substring(i, j)+" ");
            }
            System.out.println();
        }
    }
}