package hackerrank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class BirthdayCake {
    public static void main(String[] args) {
        try {
            File myObj = new File("/Users/dianagheorghe/Documents/Playground/src/hackerrank/candles.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
//                System.out.println(data);
                String[] convertedDataToArray = data.split(" ");
                List<Integer> convertedDataToList = new ArrayList<>();
                for (String number : convertedDataToArray) {
                    convertedDataToList.add(Integer.parseInt(number.trim()));
                }
                System.out.println(birthdayCakeCandles(convertedDataToList));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        candles.sort(Collections.reverseOrder());
        int candlesCount = 1;
        for (int i = 1; i < candles.size(); i++) {
            if (candles.get(0).intValue() == candles.get(i).intValue()) {
                candlesCount++;
            }
        }
        return candlesCount;
    }
}
