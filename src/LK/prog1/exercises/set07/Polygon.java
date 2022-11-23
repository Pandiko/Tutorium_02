package LK.prog1.exercises.set07;

import java.util.Arrays;

public class Polygon {
    private Point[] cornerPoints;

    public Polygon(double... coordinate) {
        cornerPoints = new Point[coordinate.length/2];
        for (int i = 0; i < coordinate.length + 1; i++) {
            cornerPoints[i] = new Point(coordinate[i], coordinate[i + 1]);
        }
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "cornerPoints=" + Arrays.toString(cornerPoints) +
                '}';
    }
}
