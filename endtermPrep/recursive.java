package endtermPrep;
import java.util.ArrayList;
//abababababab
//ab
import java.util.Scanner;

public class recursive {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.nextLine();
        String t=ob.nextLine();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<=s.length();j++)
            {
                System.out.print(s.substring(i, j));
                if(s.substring(i, j).equals(t))
                a.add(i);
            }
            System.out.println();

        }
        System.out.println(a);
        ob.close();
    }
}
