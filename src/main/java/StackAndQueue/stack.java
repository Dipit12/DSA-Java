package StackAndQueue;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        System.out.println(s.peek());
        s.pop();
        s.pop();
        System.out.println(s.peek());
        // printing the full stack
        for(int i = 0; i < s.size();i++){
            System.out.print(s.peek() + ' ');
            s.pop();
        }
    }

}
