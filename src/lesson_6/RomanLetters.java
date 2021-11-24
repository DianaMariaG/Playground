package lesson_6;

import java.util.HashMap;
import java.util.Map;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II.
 * The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
 * Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer.
 */
public class RomanLetters {
    public static void main(String[] args) {
        String s = "LIV";
        //System.out.println(romanToInt(s));
        System.out.println(romanToInt2("fddfg"));
    }
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            char currentValue = s.charAt(i);

            if (i < length-1) {
                char nextValue = s.charAt(i + 1);

                switch (currentValue) {
                    case 'I':
                        switch (nextValue) {
                            case 'V':
                                result = result + 4;
                                i++; //sare peste V luat individual, si trece peste i-ul respectiv
                                break;
                            case 'X':
                                result = result + 9;
                                i++;
                                break;
                            default:
                                result = result + map.get(currentValue);
                                break;
                        }
                        break;

                    case 'X':
                        switch (nextValue) {
                            case 'L':
                                result = result + 40;
                                i++;
                                break;
                            case 'C':
                                result = result + 90;
                                i++;
                                break;
                            default:
                                result = result + map.get(currentValue);
                                break;
                        }
                        break;

                    case 'C':
                        switch (nextValue) {
                            case 'D':
                                result = result + 400;
                                i++;
                                break;
                            case 'M':
                                result = result + 900;
                                i++;
                                break;
                            default:
                                result = result + map.get(currentValue);
                                break;
                        }
                        break;

                    default:
                        result = result + map.get(currentValue);
                        break;
                }

            } else {
                result = result + map.get(currentValue); //adaug ultimul caracter convertit in cifra araba
            }

        }
        return result;
    }


    public static int romanToInt2(String s) {
        Map<Character, Integer> map = new HashMap<>(); //cheia e mereu unica, valoarea nu; map.get mereu obtine valoarea folosindu-se de cheie
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            if (!map.containsKey(s.charAt(i))) {
                return -1;
            }
            int currentValue = map.get(s.charAt(i)); //s.charAt(i) e de fapt cheia, cu care map-ul obtine valoarea


            if (i < length-1) {
                if (!map.containsKey(s.charAt(i+1))) {
                    return -1;
                }

                int nextValue = map.get(s.charAt(i + 1));

                if (currentValue >= nextValue) {
                    result = result + currentValue;
                } else {
                    if (currentValue == 1 || currentValue == 10 || currentValue == 100) {
                        result = result + nextValue - currentValue;
                        i++;
                    } else {
                        return -1;
                    }
                    // currentValue == 1
                    // nextValue == 5
                }

            } else {
                result = result + currentValue; //adaug ultimul caracter
            }

        }
        return result;
    }
}

