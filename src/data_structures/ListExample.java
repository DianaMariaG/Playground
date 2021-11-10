package data_structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1, 20);
        list.add(30);

        list.addAll(Arrays.asList(11, 22, 33));
        System.out.println(list);
        System.out.println(list.size());
        list.remove(1);
        System.out.println(list);
        System.out.println(list.contains(10));
        System.out.println(list.contains(20));

    }
}
