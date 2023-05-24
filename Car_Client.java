public class Car_Client {
    public static void main(String[] args) {
        car c=new car();
        car[] arr=new car[5];
        arr[0]=new car(1200,190,"white");
        arr[1]=new car(1500,300,"black");
        arr[2]=new car(1300,180,"blue");
        arr[3]=new car(2000,200,"grey");
        arr[4]=new car(1800,190,"red");
        c.display(arr);
    }
}
