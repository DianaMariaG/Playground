package hackerrank;

import java.util.*;

public class UniqueNumbers {
    public static Collection<Integer> findUniqueNumbers(Collection<Integer> numbers) {
        if (numbers.isEmpty()) {
            return new HashSet<>();
        }
        Map<Integer, Integer> occurences = new HashMap<>();
        for (int number : numbers) {
            if (occurences.containsKey(number)) {
                occurences.put(number, occurences.get(number) + 1);
            } else {
                occurences.put(number,1);
            }
        }
        Collection<Integer> uniqueNumbers = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : occurences.entrySet()) {
            if (entry.getValue() == 1){
                uniqueNumbers.add(entry.getKey());
            }
        }
        return uniqueNumbers;
    }

    public static void main(String[] args) {
        Collection<Integer> numbers = Arrays.asList();
        for (int number : findUniqueNumbers(numbers))
            System.out.println(number);
    }
}
