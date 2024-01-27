package str;
// import java.util.*;

// public class SubPalin {
//     public static void main(String[] args) {
//         int s="nitin";
//         for(int i=0;i<s.length();i++)
//         {
//             for(int j=i;j<s.length();j++)
//             {

//             }
//         }
//     }
//     public static boolean ispali(String s)
//     {
//         int start=0;
//         int end=s.length()-1;
//         while(start<end)
//         {
//             if(s.charAt((start)!=s.charAt(end)))
//             return false;
//             start++;
//             end--;
//         }
//         return true;
//     }
// }
import java.util.*;
public class SubPalin {
	public static boolean pali(String st)
	{
		for(int i=0;i<st.length()/2;i++)
		{
			if(st.charAt(i)!=st.charAt(st.length()-i-1))
			return false;

		}
		return true;
	}
    public static void main(String args[]) {
        // Your Code Here
		Scanner ob=new Scanner(System.in);
		String s=ob.nextLine();
		int a=0;
		boolean ans=true;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				String s1=s.substring(i,j);
				if(ans==pali(s1))
				a++;
			}
		}
		System.out.print(a);
    }
}
