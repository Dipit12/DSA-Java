package Tree;

public class maxOfBinaryTree {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }
    public static int max(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return root.data;
        }
        int smallAns = Math.max(max(root.left),max(root.right));
        return Math.max(smallAns,root.data);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(900);
        Node n3 = new Node(4);
        Node n4 = new Node(89);
        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n1.right = n4;
        System.out.println(max(root));
    }
}
