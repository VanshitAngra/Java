//31. Next Permutation
import java.util.*;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        int p=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i] < nums[i+1])
            {
                p=i;
                break;
            }
        }
        System.out.println(p);
        int q=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[p]<nums[i])
            {
                q=i;
                break;
            }
        }
        if(p==q)
        {
            reverse(0,nums.length-1,nums);
            System.out.println(Arrays.toString(nums));
            return;
        }
        int t=nums[p];
        nums[p]=nums[q];
        nums[q]=t;
        reverse(p+1,nums.length-1,nums);
    }
    public static void reverse(int start,int end,int[] nums)
    {
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
}
