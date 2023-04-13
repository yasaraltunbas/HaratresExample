package closenumberproblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CloseNumberProblem {

    public  String[] findCloses(int[] numbers) throws Exception {
        List<String> returnValues = new ArrayList();

        try {
            validateArray(numbers);
            Arrays.sort(numbers);
            int minDiff = Integer.MAX_VALUE;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (Math.abs(numbers[i] - numbers[i + 1]) < minDiff && Math.abs(numbers[i] - numbers[i + 1]) > 0) {
                    minDiff = Math.abs(numbers[i] - numbers[i + 1]);
                }
            }
            int j = 0;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (Math.abs(numbers[i] - numbers[i + 1]) == minDiff) {
                    returnValues.add(Integer.toString(numbers[i]) + " " + Integer.toString(numbers[i + 1])) ;
                    j++;
                }
            }
            System.out.println(returnValues.toString());
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }


        return returnValues.toArray(new String[0]);
    }
    public void validateArray(int[] numbers) throws Exception {
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] <= -20000 || numbers[i] >= 20000) {
                throw new Exception();
            }
        }

        if (numbers.length <= 1 || numbers.length >= 1000) {
            throw new Exception();
        }

    }
}
