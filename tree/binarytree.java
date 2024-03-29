package tree;

public class binarytree {
    static class Node {
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
     static class Binarytree{
         static int ind=-1;
        public static Node buildtree(int[] node)
        {
            ind++;
            if(node[ind]==-1)
            return null;

            Node newNode=new Node(node[ind]);
            newNode.left=buildtree(node);
            newNode.right=buildtree(node);

            return newNode;
        }
        
    }
    public static void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root)
    {
        if(root== null)
        return ;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root)
    {
        if(root ==null)
        return ;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

        
    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree=new Binarytree();
        Node root=tree.buildtree(node);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);

    }
}
