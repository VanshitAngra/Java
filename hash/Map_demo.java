package hash;

import java.util.HashMap;
import java.util.Set;

public class Map_demo {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(3, "abc");
        // map.put(4, "xyz");
        map.put(50, "mno");
        map.put(1, "ghi");
        map.put(20, "def");
        map.put(4, "pqr");
        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.containsKey(3));
        Set<Integer> set=map.keySet();
        for(int a:set)
        {
            System.out.println(a+":"+map.get(a));
        }
        for(int a:map.keySet())
        {
            System.out.println(a+"="+map.get(a));
        }
    }
}
//for duplicate key it takes the last element passed to that key 