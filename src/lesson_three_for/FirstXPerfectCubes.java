package lesson_three_for;
import java.util.*;
// Generate an array with the first x perfect cubes
/**
 * cubesList = [],[0],[0,1],[0,1,8]
 * number = 0,1,2,3,4,5,6,7,8
 */
public class FirstXPerfectCubes {
    public static void main(String[] args) {
        int x = 3;
        System.out.println(firstPerfectCubes(x));
    }
    private static boolean isCube(int nr){
        int j = 0;
        while (j<=nr){
            if(j*j*j == nr){
                return true;
            }
            j++;
        }
        return false;
    }
    private static List<Integer> firstPerfectCubes(int x){
        List <Integer> cubesList = new LinkedList<>();
        int number = 0;
        while(cubesList.size()<x){
            if(isCube(number)){
                cubesList.add(number);
            }
            number++;
        }
        return cubesList;
    }
}
