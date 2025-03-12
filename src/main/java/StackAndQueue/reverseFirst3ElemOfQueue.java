package StackAndQueue;

import java.util.Queue;
import java.util.Stack;

public class reverseFirst3ElemOfQueue {
    public static void main(String[] args) {

    }
    public static void reverse(Queue<Integer> queue, int k){
        Stack<Integer> s = new Stack<Integer>();
        for(int i = 0; i < k;i++){
            s.push(queue.remove());
        }
        for(int i = 0; i < k;i++){
            queue.offer(s.pop());
        }
        for(int i = 0; i < queue.size() - k; i++){
            queue.offer(queue.remove());
        }

    }
}
