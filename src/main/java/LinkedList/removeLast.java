package LinkedList;

public class removeLast {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }
    public static Node removeLast(Node head){
        if(head == null){
            return null;
        }
        if(head.next != null){
            return null;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        return null;
    }
}
