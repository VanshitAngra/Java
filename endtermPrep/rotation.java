package endtermPrep;
//rotate
public class rotation {
    static String leftrotate(String str, int d)
    {
            String ans = str.substring(d) + str.substring(0, d);
            return ans;
    }
 
    // function that rotates s towards right by d 
    static String rightrotate(String str, int d)
    {
            return leftrotate(str, str.length() - d);
    }
 
    // Driver code
    public static void main(String args[])
    {
            String str1 = "Hello"; 
            System.out.println(leftrotate(str1, 4));
 
            String str2 = "Hello"; 
            System.out.println(rightrotate(str2, 4)); 
    }
}

