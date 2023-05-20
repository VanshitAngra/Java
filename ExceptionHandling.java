// public class ExceptionHandling {
//     private int age;
//     private String name;
//     public int getAge()
//     {
//         return age;
//     }
//     public void setAge(int age) throws Exception
//     {
//         if(age<0)
//         {
//             throw new Exception("Age can't be negative ");
//         }
//         else
//         this.age=age;
//     }
//     public String getName()
//     {
//         return name;
//     }
//     public void SetName(String name)
//     {
//         this.name=name;
//     }
//     public static void main(String[] args) throws Exception{
//         ExceptionHandling a=new ExceptionHandling();
//         a.setAge(-21);
//     }
// }

import java.util.Scanner;

/**
 * ExceptionHandling
 */
public class ExceptionHandling {

    public static void main (String[] args)throws Exception {
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        int b;
        try{
            b=a/0;
        }
        catch(Exception e)
        {
            throw new Exception("You cant divide number by 0");
        }
        
    }
}