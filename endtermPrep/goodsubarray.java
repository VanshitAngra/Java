package endtermPrep;

import java.util.HashSet;

// public class goodsubarray {
//     public static void main(String[] args) {
//         int n=3;
//         int[] arr={1,2,1,2,3};
//         count(arr, n);
//     }
//     public static void count(int[] arr,int n)
//     {
//         int c=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=i+1;j<arr.length;j++)
//             {
//                 if(isgood(arr,i,j,n))
//                 c++;
//             }
//         }
//         System.out.println(c);
//     }
//     public static boolean isgood(int[] arr,int i,int j,int n)
//     {
//         HashSet<Integer> set=new HashSet<>();
//         for(;i<=j;i++)
//         {
//             set.add(arr[i]);
//         }
//         return set.size()==n;
//     }
// }

import java.util.HashSet;

public class goodsubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=2;
		int[] arr={1,2,1,2,3};
		count_good_subarrays(arr,d);
	}

	private static void count_good_subarrays(int[] arr, int d) {
		// TODO Auto-generated method stub
		int c=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(isgood(arr,i,j,d)) {
					c++;
				}
			}
		}
		System.out.println(c);
	}

	private static boolean isgood(int[] arr, int i, int j,int d) {
		// TODO Auto-generated method stub
		HashSet<Integer> set=new HashSet<>();
		for(;i<=j;i++) {
			set.add(arr[i]);
		}
		return set.size()==d;
	}
}
