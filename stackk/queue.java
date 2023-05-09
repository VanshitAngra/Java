package stackk;

public class queue {
    int size=0, front=0, rear=-1;
    int[] arr;
    public queue(){
        arr=new int[5];
    }
    public queue(int x){
        arr=new int[x];
    }
    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(size==arr.length){
            return true;
        }
        return false;
    }
    public void push(int val) throws Exception{
        if(isFull()){
            throw new Exception("Queue in full");
        }
        rear=(rear+1)%arr.length;
        arr[rear]=val;
        size++;
    }
    public void pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue in empty");
        }
        front=(front+1)%arr.length;
        size--;
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue in empty");
        }
        return arr[front];
    }
    public int size(){
        return size;
    }
    public void display() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack in empty");
        }
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i%arr.length]+" ");
        }
        System.out.println();
    }
}
