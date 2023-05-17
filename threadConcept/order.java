package threadConcept;

class shop {
    int totalitems=10;
    public synchronized void getItems(int n){
        if(totalitems>=n){
            System.out.println("Order success....");
            totalitems-=n;
        }
        else{
            System.out.println("Order fail........");
        }
    }
}
public class order extends Thread{
    int n;
    public order(int n){
        this.n=n;
    }
    static shop p;

    public void run(){
        p.getItems(n);
    }
    public static void main(String[] args) {
        p=new shop();
        order t1=new order(7);
        order t2=new order(5);
        t1.start();
        t2.start();
    }
}
