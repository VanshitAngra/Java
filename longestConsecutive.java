import java.util.Scanner;
import java.util.*;

public class longestConsecutive {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int l=ob.nextInt();
        int[] arr=new int[l];
        for(int i=0;i<l;i++)
        {
            arr[i]=ob.nextInt();
        }
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]-1))
            map.put(arr[i], false);
            else
            map.put(arr[i], true);
            if(map.containsKey(arr[i]+1))
            map.put(arr[i], false);
        }


        
    }
}
