import java.util.*;

public class kmp {
    public static ArrayList<Integer> ind(String pat,String s)
    {
        ArrayList<Integer> indexs=new ArrayList<>();
        int index=0;
        while(index!=-1)
        {
            index=s.indexOf(pat,index);
            if(index!=-1)
            {
                indexs.add(index+1);
                index+=1;
            }
        }
        if(indexs.isEmpty())
        {
            indexs.add(-1);
        }
        return indexs;
    }
    public static void main(String[] args) {
        System.out.println((ind("bat","batmanandroblnarebat")));
        System.out.println("batmanandroblnarebat".indexOf("bat"));
    }
}
