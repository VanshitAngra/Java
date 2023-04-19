import java.util.*;
public class BadVersion {
    public static void main(String[] args) {
        int start =1,n,ans=0;
        Scanner ob =new Scanner(System.in);
        n =ob.nextInt();
        int end=n;
        int mid=start+(end-start)/2;
        while(start < end)
        {
            if(isBadVersion(mid))
            {
                ans=mid;
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return ans;
    }
}
