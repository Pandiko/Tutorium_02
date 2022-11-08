import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;


public class ExerciseSet05 {
    public static void main(String[] args) {
        System.out.println("1 : Zinsberechnung");
        System.out.println("2 : Durchschnittsberechnung");
        System.out.println("3 : Vector-Test");
        System.out.println("4 : Maulwurfsimulation");
        System.out.println("0 : Beenden");

        int select = Terminal.readInt("Ihre Wahl: ");

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
            case 4:
                Exercise4();
                break;
            case 0:
                break;
            default:
                System.out.println("Not available");
                break;
        }
    }
    public static void Exercise1() {

        //Declaring Variables
        int BeginAsset = Terminal.readInt("Geben sie das Anfangskapital ein [in Euro]");
        double interestRate = Terminal.readDouble("Geben sie den Zinssatz ein [in %]");
        int Duration = Terminal.readInt("Geben sie die Anlagedauer an [in Jahren]");
        double Assets = BeginAsset;

        //Loop for Calculation of Interest
        for (int i = 1; i <= Duration; i++) {
            Assets = Assets + (Assets * (interestRate / 100));
            System.out.println("Kapital nach " + i + " Jahren: " + Assets );
        }

    }
    public static void Exercise2() {

        //Declaring Variables
        int AmountNum = Terminal.readInt("Wie viele Zahlen sollen analysiert werden");
        double[] numbers = new double[AmountNum];

        //Loop for entering Numbers into Array
        for (int i = 0; i <= AmountNum - 1; i++) {
            numbers[i] = Terminal.readDouble( "nächste Zahl");
        }
        System.out.print("Die Zahlen lauten: ");

        //Declaring Variables for Calculations
        double min = numbers[0];
        double max = numbers[0];
        double sum = 0;

        //Loop for printing Array and getting Min, Max and Sum from Array
        for (int i = 0; i <= AmountNum - 1; i++) {
            System.out.print(numbers[i] + " ");
            sum += numbers[i];
            if(min > numbers[i]){
                min = numbers[i];
            }else if(max < numbers[i]){
                max = numbers[i];
            }
        }
        System.out.println();

        //Calculating Average
        double average = sum / numbers.length;

        //¬Printing Results
        System.out.println("Min: " + min + " Max: " + max + " Durchschnitt: " + average);

    }
    public static void Exercise3() {
        double[] vec1 = new double[2];
        double[] vec2 = new double[2];
        double factor;
        double deg;
        vec1[0] = Terminal.readDouble("Vektor 1, x");
        vec1[1] = Terminal.readDouble("Vektor 1, y");
        vec2[0] = Terminal.readDouble("Vektor 2, x");
        vec2[1] = Terminal.readDouble("Vektor 2, y");
        factor  = Terminal.readDouble("Faktor          ");
        deg     = Terminal.readDouble("Winkel (in Grad)");
        System.out.println("v1 * fact    : " + Arrays.toString(multi(vec1, factor)));
        System.out.println("v1 + v2      : " + Arrays.toString(plus(vec1, vec2)));
        System.out.println("v1 - v2      : " + Arrays.toString(plus(vec1, vec2)));
        System.out.println("vlength(v1)  : " + vLength(vec1));
        System.out.println("rot(v1, deg) : " + Arrays.toString(rotate2d(vec1, deg)));
    }
    public static double[] multi (double[] vec, double factor) {
        //local variable for calculation
        double[] result = new double[2];
        //calculation of vector
        for (int i = 0; i < 2; i++) {
            result[i] = factor * vec[i];
        }
        return result;
    }

    public static double[] plus (double[] vec1, double[] vec2) {
        //local variable for calculation
        double[] result = new double[2];
        //calculation of vector
        for (int i = 0; i < 2; i++) {
            result[i] = vec1[i] + vec2[i];
        }
        return result;
    }

    public static double[] minus (double[] vec1, double[] vec2) {
        //local variable for calculation
        double[] result = new double[2];
        //calculation of vector
        for (int i = 0; i < 2; i++) {
            result[i] = vec1[i] - vec2[i];
        }
        return result;
    }

    public static double[] rotate2d (double vec[], double deg) {
        //local variable for calculation
        double[] result = new double[2];
        double rad = deg * (Math.PI / 180);
        //calculation of new x
        result[0] = (vec[0] * Math.cos(rad) - vec[1]  * Math.sin(rad));
        //calculation of new y
        result[1] = (vec[0] * Math.sin(rad)) + (vec[1] * Math.cos(rad));
        return result;
    }
    public static double vLength (double[] vec) {
        double result;
        double tempRes = (vec[0] * vec[0]) + (vec[1] * vec[1]);
        result = Math.sqrt(tempRes);
        return result;
    }
    public static void Exercise4 () {

        double[] vec1 = new double[2];
        double[] vec2 = new double[2];
        double[] moleHill = new double[2];

        vec1[0] = Terminal.readDouble("Huegel 1, x");
        vec1[1] = Terminal.readDouble("Huegel 1, y");
        vec2[0] = Terminal.readDouble("Huegel 2, x");
        vec2[1] = Terminal.readDouble("Huegel 2, y");


    }

}
