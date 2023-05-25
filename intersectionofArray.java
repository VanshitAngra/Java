import java.util.*;
//leet code 349 question
public class intersectionofArray {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        int[] arr=new int[a];
        int b=ob.nextInt();
        int[] arr1=new int[b];
        for(int i=0;i<a;i++)
        {
            arr[i]=ob.nextInt();
        }
        for(int i=0;i<b;i++)
        {
            arr1[i]=ob.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                if(arr[i]==arr1[j])
                {
                    set.add(arr[i]);
                    break;
                }
            }
        }
        for(int i:set)
        {
            System.out.println(i);
        }
    }
}
