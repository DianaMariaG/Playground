package lesson_5;
import java.util.*;
// Write a method that returns the nth odd element of a list. If the index of the element exceeds the list size, then return -1
/**
 * number =   1,2,7,5,8,9,15,20
 * number%2 = 1,0,1,1,0,1, 1, 0
 * oddsList =[],[1],[1,7],[1,7,5],[1,7,5,9],[1,7,5,9,15]
 * return 9
 */
public class NthOddElement {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        list.addAll(Arrays.asList(1,2,7,5,8,9,15,20));
        System.out.println(findNthOddElement(list, 4));
    }

    private static int findNthOddElement(List<Integer> numbers, int nth){
        List<Integer> oddsList = new LinkedList<Integer>();
        for(int number : numbers){
            if(number%2 != 0){
                oddsList.add(number);
            }
        }
        if(nth <= oddsList.size()) {
            return oddsList.get(nth-1);
        } else {
            return -1;
        }
    }
}
