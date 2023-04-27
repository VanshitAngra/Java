package str;
import java.util.*;

public class SubPalin {
    public static void main(String[] args) {
        int s="nitin";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {

            }
        }
    }
    public static boolean ispali(String s)
    {
        int start=0;
        int end=s.length()-1;
        while(start<end)
        {
            if(s.charAt((start)!=s.charAt(end)))
            return false;
            start++;
            end--;
        }
        return true;
    }
}
