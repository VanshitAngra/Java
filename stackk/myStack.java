package stackk;

public class myStack {
    private int[] arr;
    private int top;

    myStack(){
        this.arr=new int[10];
    }
    myStackStack(int n){
        this.arr=new int[n];
    }

    public void push(int n){
        arr[top++]=n;
        top++;
    }
    public int pop(){
        return arr[--top];
    }
    public int peek(){
        return arr[top++];
    }
    public void display(){
        System.out.println("[");
        for(int i=0; i<=top-1; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");
    }
    public boolean isEmpty(){
        return top==0;
    }
    public boolean isFull(){
        return top==arr.length;
    }
    public int size(){
        return top;
    }
}
