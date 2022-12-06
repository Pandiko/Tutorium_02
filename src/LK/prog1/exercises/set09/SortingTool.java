package LK.prog1.exercises.set09;

import rl.util.painttool.AbstractController;
import rl.util.painttool.PaintTool;

import java.util.Arrays;

public class SortingTool extends AbstractController {

    private int swaps;

    //bubbleSort with swap counter
    private void bubbleSort(int[] numbers) {
        for (int i = numbers.length - 1; i > 0; i--) {
            for (int k = 0; k < 1; k++) {
                if (numbers[k] > numbers[k+1]) {
                    swaps(numbers, k, k+1 );
                }
            }
        }
    }

    private void quickSort(int[] numbers) {

    }

    private void swaps(int[] numbers, int pos1, int pos2) {
        int tmp = numbers[pos1];
        numbers[pos1] = numbers[pos2];
        numbers[pos2] = tmp;
        swaps++;
    }



}
