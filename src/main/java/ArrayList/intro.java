package ArrayList;

import java.util.ArrayList;

public class intro {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(1,100);
        System.out.println(list);
        System.out.println(list.get(1));
        list.set(2,12);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.size());
    }
}
