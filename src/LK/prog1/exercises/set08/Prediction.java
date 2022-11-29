package LK.prog1.exercises.set08;

import java.util.Arrays;

public class Prediction {
    public static void main(String[] args) {
        Point[] saleNumbers = new Point[] {new Point(1,15), new Point(2,37)};
        /*
        LeastSquaresEstimator estimator = new LeastSquaresEstimator();
        estimator.linearRegression(saleNumbers);
        */
        System.out.println(Arrays.toString(saleNumbers));
    }

}
