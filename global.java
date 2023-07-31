//value of the global variable is updated in the heap memory so it gets updated 
public class global {
    static int a;
    public static void main(String[] args) {
        a=5;
        System.out.println(a);
    }
}
