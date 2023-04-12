//linear search
import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class linear {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int[] arr =new int[5];
        int k=ob.nextInt();
        int a=0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=ob.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==k)
            {
                a=1;
                break;
            }
        }
        if(a==1)
        System.out.println("Present");
        else
        System.out.println("Not present");
        ob.close();

    }
}
