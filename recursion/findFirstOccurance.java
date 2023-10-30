package recursion;

public class findFirstOccurance {
    static void  find(int index,int n,int[] arr)
    {
        if(arr[index]==n)
        {
            System.out.println(index);
            return;
        }
        find(index++, n, arr);

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,5,4,3};
        int i=0;
        int num=5;
        find(i, num, arr);
        
    }
}
