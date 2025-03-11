package LinkedList;

public class addLast {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data =data;
            next = null;
        }

    }
    public static void main(String[] args) {

    }

    public static Node addLast(Node head, int value){
        Node n = new Node(value);
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        tail.next = n;
        return head;

    }
}
