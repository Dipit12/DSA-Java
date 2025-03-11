package LinkedList;

public class searching {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }

    }
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next = n2;
        n2.next = n3;

        Node temp = n1;

        int target = 2;
        while(temp != null){
            if(temp.data == target){
                System.out.println("Target found");
                return;
            }else{
                temp = temp.next;
            }
        }

    }
}
