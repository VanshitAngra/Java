package hash;

import java.util.TreeMap;

public class TreeMap_Demo {
    public static void main(String[] args) {
        TreeMap<Integer,String> map=new TreeMap<>();
        map.put(3, "abc");
        map.put(50, "mno");
        map.put(1, "ghi");
        map.put(20, "def");
        map.put(4, "pqr");
        System.out.println(map);
    }
}
