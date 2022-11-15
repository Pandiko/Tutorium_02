import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class ExerciseSet06 {
    public static void main(String[] args) {
        int select = Terminal.readInt("Which Assigment?");

        switch (select) {
            case 1:
                Exercise1();
                break;
            case 2:
                Exercise2();
                break;
            case 3:
                Exercise3();
                break;
        }

    }
    public static void Exercise1() {

        int size = Terminal.readInt("size of the array");
        int min = Terminal.readInt("min of the contained numbers");
        int max = Terminal.readInt("max of the contained numbers");

        int[] randomArray = new int[size];

        randomNumberGenerator(randomArray, min, max);
        System.out.println("Unsorted" + Arrays.toString(randomArray));

        BubbleSort(randomArray);
        System.out.println("Sorted" + Arrays.toString(randomArray));

    }

    public static int[] randomNumberGenerator (int[] array, int min, int max) {
        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(min, max);
        }
        return array;
    }

    public static void BubbleSort (int[] array) {

        for (int i = array.length-1; i > 0; i--) {
            for (int k  = 0; k < i; k++) {
                if (array[k] > array[k+1]) {
                    int temp = array[k];
                    array[k] = array[k+1];
                    array[k+1] = temp;
                }
            }
        }
    }

    public static void Exercise2() {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int number = r.nextInt(1 , 20);
        System.out.println("I found a number between 1 and 20. Guess what it is ");

        for (int i = 0; i < 20; i++) {
            System.out.print("Your Guess: ");
            int guess = scanner.nextInt();

            if (guess == number) {
                System.out.println("You got it!");
                break;
            } else if (guess < number) {
                System.out.println("My number is larger!");
            } else if (guess > number) {
                System.out.println("My number is smaller!");
            }
        }
        scanner.close();

    }
    public static void Exercise3 () {
        Scanner scanner2 = new Scanner(System.in);

        int temp = 0;

        System.out.print("Text that should be checked: ");
        String text = scanner2.nextLine();

        System.out.print("Text that should be found: ");
        String match = scanner2.nextLine();

        if (text.contains(match)) {
            for (int i = 0; i <= text.length(); i++) {
                if (match.charAt(0) == text.charAt(i)) {
                    temp = i;
                    break;
                }
            }
            temp++;
        } else {
            temp = -1;
        }
        System.out.println("Position is: " + temp);
    }
}
