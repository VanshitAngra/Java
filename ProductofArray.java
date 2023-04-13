import java.util.*;

//leet code
//238. Product of Array Except Self
public class ProductofArray {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        
        int[] arr={1,2,3,4};
        int[] left =new int[arr.length];
        int mul=1;
        for(int i=0;i<arr.length;i++)
        {
            left[i]=mul;
            mul*=arr[i];
        }
        System.out.println(Arrays.toString(left));
        int right[]=new int[arr.length];
        mul=1;
        for(int i=arr.length-1;i>=0;i--)
        {
            right[i]=mul;
            mul*=arr[i];
        }
        System.out.println(Arrays.toString(right));
    }
}
