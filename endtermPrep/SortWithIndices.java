 package endtermPrep;
import java.util.*;

public class SortWithIndices {
    
    public static int[] sortAndReturnIndices(int[] arr) {
        int n = arr.length;
        
        // Create an array of indices
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        
        // Sort the indices array based on the values in the original array
        Arrays.sort(indices, (a, b) -> Integer.compare(arr[a], arr[b]));
        // Convert Integer[] to int[]
        int[] ans=new int[n];
        for(int i=0;i<n;i++)
        {
            ans[i]=indices[i];
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=ob.nextInt();
        }
        int[] sortedIndices = sortAndReturnIndices(array);
        
        System.out.println("Sorted indices:");
        for (int index : sortedIndices) {
            System.out.print(index + " ");
        }
    }
}
