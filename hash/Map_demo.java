package hash;

import java.util.HashMap;

public class Map_demo {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(3, "abc");
        map.put(50, "mno");
        map.put(1, "ghi");
        map.put(20, "def");
        map.put(4, "pqr");
        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.containsKey(3));
    }
}
