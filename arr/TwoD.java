package arr;
// import java.util.Scanner;

// public class TwoD {
//     public static void main(String[] args) {
//         Scanner ob=new scanner(System.in);
//         int[][]arr=new int[3][4];
//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=0;j<arr.length;j++)
//             {
                
//             }
//         }
//     }
// }
// package str;

import javax.lang.model.util.ElementScanner14;

public class TwoD {
    public static void main(String[] args) {
    String s="cbaeicdeioua";
    String s1="";
    int ans=0;
    for(int i=0;i<s.length();i++)
    {
        for(int j=0;j<s.length();j++)
        {
            s1=s.substring(i,j+1);
            String s2="";
            int a=0;
            for(int k=0;k<s1.length();k++)
            {
                if(s1.charAt(k)=='a'||s1.charAt(k)=='e'||s1.charAt(k)=='i'||s1.charAt(k)=='o'||s1.charAt(k)=='u')
                {
                    a++;
                    ans=Math.max(ans, a);
                }
                else
                {
                    
                    a=0;
                } 
            }
            // if()  
             
        }
        
    }
    System.out.println(ans);
    }
}
