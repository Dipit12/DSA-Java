package LinkedList;

public class removeFirst {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    public static Node removeFirst(Node head){
        // 10,20,30,40
        if(head == null){
            return head;
        }
        head = head.next;
        return head;
    }
}
