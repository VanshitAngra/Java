package linklist;

public class ll {
    class Node{
        String data;
        Node next;

        Node(String data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(String data)
    {
        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data)
    {
         Node newNode =new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode!=null)
        {
            currNode=currNode.next;
        }

    }
    public static void main(String[] args) {
         ll list=new ll();
         addFirst("a"); 
         addFirst("is");  
    }
}
