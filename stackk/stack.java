package stackk;
//stack 1st program
public class stack {
    int size=0, tos=-1;
    int[] arr = new int[5];



    public boolean isEmpty (){
        if (tos==-1) {
            return true;
        }

        return false;
    }

    public boolean isFull () {
        if (tos == arr.length-1) {
            return true;
        }

        return false;
    }

    public stack() {
        arr=new int[5];
    }
    public stack(int n) {
        arr = new int[n];
    }

    public void push (int val) throws Exception {
        if (isFull()) {
            throw new Exception("Stack is full");
        }
        tos++;
        arr[tos] = val;
        size++;

    }

    public void pop () throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is Empty.");
        }
        tos--;
        size--;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is Empty.");
        }

        return arr[tos];
    }

    public int size () {
        return size;
    }

    public void display () throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is Empty.");
        }

        for (int i=0; i<=tos; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
