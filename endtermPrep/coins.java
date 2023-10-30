package endtermPrep;

import java.util.*;

public class coins {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        for(int i=0;i<n;i++)
        {
            int t=ob.nextInt();
            String[] coins=new String[t];
            for(int j=0;j<t;j++)
            {
                coins[j]=ob.next();
            }
            Arrays.sort(coins,new Comparator<String>() {
                @Override
                public int compare(String a,String b)
                {
                    return (b+a).compareTo(a+b);
                
                }
            });
            for(String coin:coins)
            {
                System.out.print(coin+"");
            }
            System.out.println();
        }
        ob.close();
        
    }
}
