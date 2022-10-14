public class TrainingPopulationPredictor {
    public static void main(String[] args) {
        populationPrediction(10, 0.3, 20);
    }
    public static void populationPrediction (int numOfYears, double rateOfGrowth, int initialPopulation) {
        int year = 1;
        double currPopulation = initialPopulation;
        while (year <= numOfYears) {
            currPopulation = currPopulation + rateOfGrowth * currPopulation;
            System.out.println("year: " + year + " Population: " + currPopulation);
            year++;

        }
    }
}
