package threadConcept;


public class Sync_Demo implements Runnable{
    public void run()
    {
        for (int i = 0; i < 5; i++) {
            
        
            try{
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            System.out.println(i);
        }
        System.out.println("Running...");
    }
    public static void main(String[] args) {
        MultiThreadingDemo m1=new MultiThreadingDemo();
        Thread t1=new Thread(m1);
        // Thread t2=new Thread(m1);
        // System.out.println(t1.getName());
        // System.out.println(t2.getName());
        // System.out.println(t1.getPriority());
        // System.out.println(t2.getPriority());
        t1.setPriority(1);
        System.out.println(t1.getPriority());
        t1.start();
        System.out.println(t1.isAlive());
        
        // t2.start();
    }
}
