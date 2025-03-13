package Tree;

public class sumOfNodes {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }
    public static int size(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        return size(root.left) + size(root.right) + 1;
    }
    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return root.data;
        }
        return sum(root.left) + sum(root.right) + root.data;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        root.left =n1;
        root.right =n2;
        n1.left = n3;
        n2.right = n4;
        System.out.println(size(root));
        System.out.println(sum(root));
    }
}
