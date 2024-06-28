package arr;

import java.util.Arrays;

public class sort2d {
    public static void main(String[] args) {
        int[][] array = {{3, 2, 1}, {6, 5, 4}, {9, 8, 7}};
        for(int i=0;i<array.length;i++)
        {
            Arrays.sort(array[i]);
    
        }
        for(int i=0;i<array.length;i++)
        {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
