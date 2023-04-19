
import java.util.*;
public class Square {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int start=1;
        int end=n/2;
        int ans=0;
        while(start < end)
        {
            int mid=start+(end-start)/2;
            if(mid*mid<=n)
            {
                ans=mid;
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        System.out.println(ans);
    }
}
