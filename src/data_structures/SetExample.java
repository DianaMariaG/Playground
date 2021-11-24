package data_structures;

import java.net.SocketOption;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// List1: [10, 20]
// List2: [20, 30, 40]

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10);

        //System.out.println(set.contains(10));

        //System.out.println(set.remove(10));

        //System.out.println(set);
        List<Integer> list1 = Arrays.asList(10,20);
        List<Integer> list2 = Arrays.asList(20,30,40);
        System.out.println(union(list1, list2));
        System.out.println(difference(list1,list2));
        System.out.println(difference(list2,list1));
        System.out.println((intersection(list1,list2)));

        int number = 10;
        Integer number2 = 4;

        number2 = new Integer(5); //creeaza obiect

    }

    private static Set<Integer> union(List<Integer> list1, List<Integer> list2) {
        Set<Integer> unionSet = new HashSet<>();
        for(int element : list1){
            unionSet.add(element);
        }
        for (int element : list2){
            unionSet.add(element);
        }
        return unionSet;
    }

    private static Set<Integer> difference(List<Integer> list1, List<Integer> list2) {
        Set<Integer> difSet = new HashSet<>();
        for(int element : list1){
            if(!list2.contains(element)){
                difSet.add(element);
            }
        }
        return difSet;
    }

    private static Set<Integer> intersection(List<Integer> list1, List<Integer> list2) {
        Set<Integer> interSet = new HashSet<>();
        for(int element : list1){
            if(list2.contains(element)){
                interSet.add(element);
            }
        }
        return interSet;
    }
}
