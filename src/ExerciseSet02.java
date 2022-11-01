import com.sun.source.tree.IfTree;

public class ExerciseSet02 {
    public static int computeSum(int number) {
        int result = 0;
        int i = 1;
        while (i <= number) {
            result = result + i; i = i + 1;
        }
        return result;
    }
    public static void main(String[] args) {
        int num = Terminal.readInt("Provide a number");
        int SequenceNumber = Terminal.readInt("Which Sequence should be used");
        if (SequenceNumber == 1) {
            printSequence1(num);
        } else if (SequenceNumber == 2) {
            printSequence2(num);
        }else if (SequenceNumber == 3) {
            printSequence3(num);
            String answer = Terminal.readString("Wanna visualise your Triangular Number: ");
            if (answer == "yes") {
                printTriangle(num);
            }

        }else {
            System.out.println("Sequence not Found");
        }
    }
    public static void printSequence1(int AofNum) {
        int n = 0;
        int QuadNum = 0;
        System.out.print("Sequence 1: ");
        while (n <= AofNum) {
            QuadNum = n * n;
            System.out.print(QuadNum + " ");
            n++;
        }
        System.out.println(" ");
    }
    public static void printSequence2(int AofNum) {
        int n = 1;
        int negPosNum = 0;
        System.out.print("Sequence 2: ");
        while (n<= AofNum) {
            if ((n % 2) == 0) {
                negPosNum = n * -1;
            }else {
                negPosNum = n;
            }
            System.out.print(negPosNum + " ");
            n++;
        }
    }
    public static void printSequence3(int AofNum) {
        int n = 1;
        int TriNum = 0;
        System.out.print("Triangular numbers: ");
        while (n <= AofNum) {
            TriNum = (n * (n + 1)) / 2;
            System.out.print(TriNum + " ");
            n++;
        }

    }
    public static void printTriangle(int AofNum) {
        int n = 1;
        int TriNum = 0;
        while (n <= AofNum) {
            for (int i = 1; i <= AofNum - n; i++) {
                System.out.print(" ");
            }
            for (int e = 1; e <= n; e++) {
                System.out.print(".");
            }
            System.out.println("");

        }
    }
}
