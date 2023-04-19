import java.util.Arrays;

public class CircularSubArray {
    public static void main(String[] args) {
        int[] arr={8,-8,9,-9,10,-11,12};
        int nkad=kadens(arr);
        System.out.println(nkad);
        int nsum=sum(arr);
        System.out.println(nsum);
        System.out.println(Arrays.toString(arr));
    }
    public static int sum(int[] arr)
    {
        for(int i=0;i<)
    }
    public static int kadens(int[] arr)
    {
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            ans=Math.max(ans, sum);
            if(sum<0)
            sum=0;
        }
    }
}
