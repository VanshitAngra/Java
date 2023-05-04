public class excep {
    public static void main(String[] args) {
        int[] arr=new int[5];
        int a=10;
        String s=null;
        try{
            int k=a/0;
            // arr[7]=13;
            // System.out.println(s.length());
            try{
                arr[7]=13;

            }
            catch (Exception d)
            {
                d.printStackTrace();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Finally");
        }
    }
}
