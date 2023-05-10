package stackk;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextGreatest {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        System.out.println("Enter elements");
        int arr[]=new int[n];
        int arr2[]=new int[n];
        //without stack
    //     for(int i=0;i<n;i++)
    //     {
    //         arr[i]=ob.nextInt();
    //     }
    //     for(int i=0;i<n-1;i++)
    //     {
    //         for(int j=i+1;j<n;j++)
    //         {
    //             if(arr[j]>arr[i])
    //             {
    //                 if(arr[j]>arr[i])
    //                 {
    //                     arr2[i]=arr[j];
    //                     c++;
    //                     break;
    //                 }
    //             }
    //         }
    //         if(c==0)
    //         {
    //             arr2[i]=-1;
    //         }
    //         c=0;
    //     }
    //     arr2[n-1]=-1;
    //     System.out.println(Arrays.toString(arr2));
        Stack <Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while (!st.isEmpty()&& arr[i]>arr[st.peek()]) {
                arr2[st.peek()]=arr[i];
                st.pop();
            }
            st.push(i);

        }
        while (!st.isEmpty()) {
            arr2[st.peek()]=-1;
            st.pop();
            
        }
        System.out.println(Arrays.toString(arr2));
    }
    
}
