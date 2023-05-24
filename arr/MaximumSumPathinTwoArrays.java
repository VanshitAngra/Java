package arr;

import java.util.*;
public class MaximumSumPathinTwoArrays {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] arr = new int[n];
			int[] brr = new int[m];
			for(int i=0;i<n;i++) arr[i] = sc.nextInt();
			for(int j=0;j<m;j++) brr[j] = sc.nextInt();
			int res = 0;
			int s1 = 0;
			int s2 = 0;
			int i = 0;
			int j = 0;
			while(i<n && j<m){
				if(arr[i]<brr[j]){
					s1+=arr[i++];
				}
				else if(arr[i]>brr[j]){
					s2+=brr[j++];
				}
				else{
					res+=Math.max(s1,s2) + arr[i];
					s1 = 0;
					s2 = 0;
					i++;
					j++;
				}
			}
			while(i<n) s1+=arr[i++];
			while(j<m) s2+=brr[j++];
			res+=Math.max(s1,s2);
			System.out.println(res);
		}
		sc.close();
    }
}
