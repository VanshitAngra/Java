package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class permutation {
    public static List<List<Integer>> an(int[] nums)
    {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort( nums);
        check(nums,nums.length,0,ans);
        return ans;

    }
    public static void check(int[] nums,int n,int ind,List<List<Integer>> ans)
    {
        if(ind==n)
        {
            List <Integer> list=new ArrayList<>();
            for(int i:nums)
            list.add(i);

            ans.add(list);
            return ;
        }
        for(int i=ind;i<n;i++)
        {
            swap(nums,i,ind);
            check(nums, n, ind+1, ans);
            swap(nums,i,ind);
        }
    }
    public static void swap(int[] nums,int s,int e)
    {
        int t=nums[s];
        nums[s]=nums[e];
        nums[e]=t;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
        }
        
    }
}
