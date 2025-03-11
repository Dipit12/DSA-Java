package LinkedList;

public class addAtHead {
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
        Node n4 = new Node(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        // printing the linkedlist
//        Node temp = n1;
//        while(n1.next != null){
//            System.out.print(n1.data + " ");
//            n1 = n1.next;
//        }

        addtoHead(n1,5);
        Node temp = n1;
        while(n1.next != null){
            System.out.print(n1.data + " ");
            n1 = n1.next;
        }
    }

    public static Node addtoHead(Node head,int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        return head;
    }


}
