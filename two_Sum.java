// leet code
// 1.two sum
import java.util.*;
import java.io.*;

public class two_Sum {
    public static void main(String[] args) {
        int[] arr={2,3,6,7,9,11,15};
        int target =9;
        int start=0;
        int end=arr.length-1;

        while(start < end )
        {
            if(arr[start]+arr[end] == target)
            {
                System.out.println(start + " "+end);
                start++;
                end--;
            }
            else if(arr[start]+arr[end] <target)
            {
                start++;
            }
            else
            end--;
        }
    }
}
