package str;

public class Stringbuffer {
    public static void main(String[] args) {
        String s="ABCDEF";
        StringBuffer sb=new StringBuffer(s);
        StringBuffer sb1=new StringBuffer("abc");
        System.out.println(sb);
        // System.out.println(sb1);
        // sb.append("abc");
        sb.reverse();
        System.out.println(sb);

        int start=(int)System.currentTimeMillis();
        for(int i=0;i<10000;i++)
        {
            s+="a";
        }
        int end=(int)System.currentTimeMillis();
        System.out.println(end-start);
        start=(int)System.currentTimeMillis();
        for(int i=0;i<10000;i++)
        {
            sb=sb.append("a");
        }
         end=(int)System.currentTimeMillis();
        System.out.println(end-start);

    }
}
