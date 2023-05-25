package arr;
import java.util.*;
import java.io.*;
public class array1 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println(arr);
        
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=ob.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        ob.close();
    }
}
