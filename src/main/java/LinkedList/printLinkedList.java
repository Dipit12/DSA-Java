package LinkedList;

public class printLinkedList {
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
        Node temp = n1;
        int count = 0;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
            count++;
        }
        System.out.println("Length of this linkedlist is " + count);
    }
}
