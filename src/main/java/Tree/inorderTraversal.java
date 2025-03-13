package Tree;

public class inorderTraversal {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static void inorder(Node head){
        if(head == null){
            return;
        }
      System.out.println(head.left);
       System.out.println(head.data);
        System.out.println(head.right);
      ;
    }
}
