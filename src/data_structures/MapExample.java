package data_structures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        //map nume -> nota
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 10);
        map.put("Paul", 9);
        map.put("Carla", 8);
        map.put("Dan", 9);

        map.put("Alice", 5);
//
//        System.out.println(map);
//
//        System.out.println(map.get("Alice"));
//        System.out.println(map.containsKey("dadsads"));
//        System.out.println(map.containsKey("Carla"));
//        System.out.println(map.containsValue(10));
//
//        map.remove("Alice");
//        System.out.println(map);
        List<Integer> list = Arrays.asList(1, 3, 5, 3, 1, 7, 5, 9, 2, 1, 9, 5);
        //System.out.println(findOccurences(list));
        String words = "element";
        System.out.println(findCharOccurences(words));
    }

    /**
     * given a list of integers, return a map with the list of occurences of each element
     * [1, 3, 5, 3, 1, 7, 5, 9, 2, 1, 9, 5]
     * {1=2, 3=2, 5=3, 7=1, 9=2, 2=1}
    */
    private static Map<Integer, Integer> findOccurences(List<Integer> list){
        Map<Integer,Integer> resultMap = new HashMap<>();
        for(int element : list){
            if(resultMap.containsKey(element)){
                resultMap.put(element,resultMap.get(element)+1);
            } else {
                resultMap.put(element, 1);
            }
        }
        return resultMap;
    }


    /**
     * given a string return a map with the list of occurences of each character
     * "element"
     * {e=3, l=1, m=1, n=1, t=1}
     */
    private static Map<Character,Integer> findCharOccurences(String words){
        Map<Character,Integer> result = new HashMap<>();
        char[] letters = words.toCharArray();
        for(char c : letters){
            if(result.containsKey(c)){
                result.put(c,result.get(c)+1);
            } else {
                result.put(c,1);
            }
        }
        return result;
    }
}
