package stackk;

public class dstackclient {
    public static void main(String[] args)throws Exception {
		dynamicStack d=new dynamicStack();
		d.push(11);
		d.push(12);
		d.push(13);
		d.push(14);
		d.push(15);
		d.push(16);
		d.push(17);
		d.display();
		d.pop();
		d.display();
	}
}
