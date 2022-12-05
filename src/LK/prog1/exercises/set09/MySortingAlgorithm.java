package LK.prog1.exercises.set09;

public class MySortingAlgorithm {

    public static int[] sort(int[] numbers) {
        for (int i = numbers.length - 1; i > 0; i--) {
            for (int k = 0; k < 1; k++) {
                if (numbers[k] > numbers[k+1]) {
                    int tmp = numbers[k];
                    numbers[k] = numbers[k+1];
                    numbers[k+1] = tmp;
                }
            }
        }
        return numbers;
    }


}
