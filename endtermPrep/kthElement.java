package endtermPrep;

import java.util.ArrayList;
import java.util.Scanner;

public class kthElement {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int n=ob.nextInt();
        while(n!=-1)
        {
            arr.add(n);
            n=ob.nextInt();
        }
        int t=ob.nextInt();
        System.out.println(arr.get(arr.size()-t));
        ob.close();
    }
}
