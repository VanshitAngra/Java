package arr;
import java.util.*;
import java.math.*;
public class RainWater {
    public static void main(String[] args) {
        int[] height={4,2,0,3,2,5};
        int left[]=new int[height.length];
        int ans =0;
        left[0]=height[0];
        for(int i=1;i<height.length;i++)
        {
            left[i]=Math.max(left[i-1], height[i]);
        }
        System.out.println(Arrays.toString(left));
        int right[]=new int[height.length];
        right[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--)
        {
            right[i]=Math.max(right[i+1], height[i]);
        }
        System.out.println(Arrays.toString(right));
        for(int i=0;i<height.length;i++)
        {
            ans+=Math.min(left[i],right[i])-height[i];
        }
        System.out.println(ans);

    }
}
