package str;

import javax.lang.model.util.ElementScanner14;

public class GoodString {
    public static void main(String[] args) {
    String s="cbaeicde ";
    String s1="";
    int ans=0;
    for(int i=0;i<s.length();i++)
    {
        for(int j=i;j<s.length();j++)
        {
            s1=s.substring(i,j);
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
             
        }
        
    }
    System.out.println(ans);
    }
}
