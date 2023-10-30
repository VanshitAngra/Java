package endtermPrep;

public class target {
    public static void main(String[] args) {
        String s="abncd";
        int a=2,b=4;
        StringBuffer n=new StringBuffer(s);
        n=n.insert(a,"*");
        n=n.insert(b,"*");
        System.out.println(n);
    }
}
