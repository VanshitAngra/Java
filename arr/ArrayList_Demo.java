package arr;
import java.util.*;

public class ArrayList_Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.add(1, 100);
        System.out.println(list);
        for(int k : list)
        {
            System.out.println(k);
        }
        // for(int k:list)
        // {
        //     System.out.println(k);
        // }
    }
}
