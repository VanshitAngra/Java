package tree;

public class bst2 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class bst{
        static int i=-1;
        public static Node buildtree(int[] node)
        {
            i++;
            if(node[i]==-1)
            return null;
            
            Node nextNode=new Node(node[i]);
            nextNode.left=buildtree(node);
            nextNode.right=buildtree(node);

            return nextNode;
        }

    }
    public static void preorder(Node root)
    {
        if(root==null)
        return;
        System.out.print(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        bst tree=new bst();
        Node root=tree.buildtree(node);
        preorder(root);
    }
}
