package data_structures;

import java.util.Scanner;

/**
 * Have the function OffBinary (strArr)
 * read the array of strings stored in strarr,
 * which will contain two elements, the first
 * will be a positive decimal number and the
 * second element will be a binary number.
 * Your goal is to determine how many digits
 * in the binary number need to be changed to
 * represent the decimal number correctly
 * (either 0 change to 1 or vice versa). For
 * example: if strArr is ["56", "011000") then
 * your program should return 1 because only
 * 1 digit needs to change in the binary
 * number (the first zero needs to become a
 * 1) to correctly represent 56 in binary.
 */
class OffBinary{
    public static void main(String[] args) {
        String[] strArr = new String[]{"5624","0010111111001"};
        System.out.println(offBinary(strArr));
    }
    
    public static  String offBinary(String[] strArr) {
        int decimalNumber = Integer.parseInt(strArr[0]);
        String bin = Integer.toBinaryString(decimalNumber);
        char[] binaryChar = strArr[1].toCharArray();
        String result = "";

        int i = 0;
        int count = 0;
        for (char letter : bin.toCharArray()) {
            if (letter != binaryChar[i]) {
                count++;
            }
            i++;
        }
        return result + count;
    }
}




