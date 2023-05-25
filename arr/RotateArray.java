package arr;
//189. rotate array 
import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,6,7};
        Scanner ob=new Scanner(System.in);
        int k=3,a=0;
        int[] nums1=new int[7];
        // for(int i=k+1;i<nums.length;i++)
        // {
        //     nums1[a]=nums[7-1-a];
        //     a++;
        // }
        // for(int i=0;i<=k;i++)
        // {
        //     nums1[a]=nums[i];
        //     a++;
        // }
        // for(int i=0;i<7;i++)
        // {
        //     System.out.println(nums1[i]);
        // }
        // int j=0;
        // while(j<k)
        // {
        //     int val=nums[nums.length - 1];
        //     for(int i=nums.length-2;i>=0;i--)
        //     {
        //         nums[i+1]=nums[i];
        //     }nums[0]=val;
        //     j++;
        // }
        k%=nums.length;
        reverse(0,nums.length -1,nums);
        System.out.println(Arrays.toString(nums));
        reverse(0,k-1,nums);
        System.out.println(Arrays.toString(nums));
        reverse(k,nums.length -1,nums);
        System.out.println(Arrays.toString(nums));


    }
    public static void reverse(int start,int end,int[] nums) {
        while(start < end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
