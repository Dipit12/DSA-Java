package LinkedList;

public class addAtIndex {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args) {

    }

    public static Node addAtIndex(Node head, int value, int index){
        if(head == null){
//            return addFirst(value); // this would be a function which we have already created
        }
        Node n = new Node(value);
        Node temp = head;
        for(int i = 0; i < index - 1; i++){
            temp = temp.next;
        }
        n.next = temp.next;
        temp.next = n;
        return head;
    }
}
