package endtermPrep;

import java.util.*;

public class box {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
        }
        // int paired=0;
        // int unpaired=0;
        // for (int i = 0; i < arr.length; i++){
        //     paired+=arr[i]/2;
        //     unpaired+=arr[i]%2;
        // }
        // for (int i = 0; i < n-1; i++) {
        //     int pair=Math.min(unpaired, unpaired+1);
        //     paired+=pair;
        //     unpaired-=pair;

        // }
        // System.out.println(paired);
        int pairs =0;
        int unpaired=0;
    
        for(int i=0; i<arr.length; i++){
            pairs+=arr[i]/2;
            unpaired+=arr[i]%2;
        }
    
        for(int i=0; i<n-1; i++){
            int pairsRem = Math.min(unpaired, unpaired+1);
            pairs+=pairsRem;
            unpaired-=pairsRem;
        }
        System.out.println(pairs);
    
    }
}
