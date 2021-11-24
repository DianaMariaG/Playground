package lesson_6;

import java.util.*;

/**
 * Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of favorite restaurants represented by strings.
 * You need to help them find out their common interest with the least list index sum. If there is a choice tie between answers,
 * output all of them with no order requirement. You could assume there always exists an answer.
 *
 * Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["KFC","Shogun","Burger King"]
 * Output: ["Shogun"]
 * Explanation: The restaurant they both like and have the least index sum is "Shogun" with index sum 1 (0+1).
 */
public class MinimumIndexSumOf2Lists {
    public static void main(String[] args) {
        String[] list1 = {"Burger King","KFC","Tapioca"};
        String[] list2 = {"Tapioca", "KFC", "Burger King"};
        System.out.println(Arrays.toString(findRestaurant(list1, list2)));
    }

    public static String[] findRestaurant(String[] list1, String[] list2){
        Map <String, Integer> map = new HashMap<>();
        Vector<String> result = new Vector<String>();
        int leastSumIndex = Integer.MAX_VALUE;
        List<String> list = new ArrayList<>();

        for (int i = 0; i < list1.length; i++){
            map.put(list1[i],i);
        }

        for(int j = 0; j<list2.length; j++){
            if(map.containsKey(list2[j])){

                int sum = map.get(list2[j]) + j;

                if(sum < leastSumIndex){
                    leastSumIndex = sum;
                    result.clear(); //sterge toate elementele din lista/set/vector
                    result.add(list2[j]);
                } else if(sum == leastSumIndex){
                    result.add(list2[j]);
                }
            }
        }
         String[] finalResult = (result.toArray(new String[result.size()]));
         return finalResult;
    }
}
