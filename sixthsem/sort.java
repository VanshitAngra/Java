package sixthsem;


import java.util.*;

public class sort {
    public static void main(String[] args) {
         Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
        }
        Integer[] indices=new Integer[n];
        for(int i=0;i<n;i++)
        {
            indices[i]=i;
        }
        Arrays.sort(indices,(a,b) -> Integer.compare(arr[a],arr[b]));
        int[] ans=new int[n];
        for(int i=0;i<n;i++)
        {
            ans[i]=indices[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
