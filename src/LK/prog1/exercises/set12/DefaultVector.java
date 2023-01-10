package LK.prog1.exercises.set12;

public class DefaultVector implements Vector {

    double[] newVec;

    public DefaultVector(double... newVec) {
        this.newVec = newVec;
    }

    @Override
    public void add(double[] vec1, double[] vec2) {
        if (vec1.length == vec2.length) {
            for (int i = 0; i<vec1.length; i++) {
                newVec[i] = vec1[i] + vec2[i];
            }
        } else {
            error();
        }


    }

    @Override
    public void sub(double[] vec1, double[] vec2) {
        if (vec1.length == vec2.length) {
            for (int i = 0; i<vec1.length; i++) {
                newVec[i] = vec1[i] - vec2[i];
            }
        } else {
            error();
        }
    }

    @Override
    public void multi(double[] vec1, double factor) {
        for (int i = 0; i<vec1.length; i++) {
            newVec[i] = vec1[i] * factor;
        }
    }

    @Override
    public double length(double[] vec1) {
        double sum = 0;
        for (double v : vec1) {
            sum += v;
        }
        return Math.sqrt(sum);
    }
    public void error() {
        System.err.println("VectorLength not equal");
    }

    @Override
    public double getVector() {
        return 0;
    }
}
