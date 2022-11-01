public class ExerciseSet03 {
    public static void main(String[] args) {
        int answer = Terminal.readInt("Which Part of the Assigment?");
        if (answer == 1) {
            initialPart();
        } else if (answer == 2) {
            planProject();
        } else if (answer == 3) {
            int year = Terminal.readInt("Which year?");
            int month = Terminal.readInt("Which month?");
            int amountDays  = getDaysOfMonth(month, year);
            System.out.println("The month is " + amountDays + " Days long");
        } else if (answer == 4) {
            int year = Terminal.readInt("Which year?");
            int month = Terminal.readInt("Which month?");
            int day = Terminal.readInt("Which day");
            int days = getDaysOfWeek(month, year, day);
            System.out.println("The month is " + days + " long");
        } else if (answer == 5) {
            int year = Terminal.readInt("Which year?");
            int month = Terminal.readInt("Which month?");
            printCalendar(month, year);
        } else {
            System.out.println("Not a part in the assigment");
        }
    }
    public static void initialPart() { //Anfängliche Übung
        int i = 1;
        int m = 3;
        String name = "Luca";
        while (i <= m) {
            System.out.println(name);
            i++;
        }
    }
    public static void planProject() { //Aufgabe 2
        //Abfrage der Parameter
        int workHours = Terminal.readInt("How many WorkHours are needed? ");
        int moneyHour = Terminal.readInt("Whats the compensation per hour? ");
        int amountWorkers = Terminal.readInt("How many Workers are available? ");

        //Berrechnung
        int moneyNeeded = workHours * moneyHour;
        int daysTotal = Math.ceilDiv(workHours / amountWorkers, 8);
        //Ergebnis zeigen
        System.out.println("The Project costs " + moneyNeeded + "€ and needs " + daysTotal + " days");
    }
    public static int getDaysOfMonth (int month, int year) { //Aufgabe 3
        int amountDays;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            amountDays = 31;
        } else if (month == 2) {
            if (year % 4 == 0 && (year % 100 == 0 && year % 400 == 0)) {
                amountDays = 29;
            } else {
                amountDays = 28;
            }
        } else {
            amountDays = 30;
        }
        return amountDays;
    }
    public static int getDaysOfWeek (int month, int year, int day) { //Aufgabe 4
        int dayOfWeek;
        int m;
        int y;
        if (month == (1 | 2)) {
            m = 12 + month;
            y = year - 1;
        }else {
            m = month;
            y = year;
        }
        int century = y / 100;
        int K = y - century;

        double q = ((m + 1) * 13) / 5;
        int h = (int)((day + q + K + (K / 4) + (y / 4) - (2 * century)) % 7);
        dayOfWeek = ((h + 5) % 7) + 1;
        return dayOfWeek;
    }
    public static void printCalendar (int month, int year) { //Aufgabe 5
        int StartOfMonth = 1;
        System.out.println("Mo Di Mi Do Fr Sa So");
        int EndOfMonth = getDaysOfMonth(month, year);
        int initialDay = getDaysOfWeek(month, year, StartOfMonth);
        for (int e = 1; e <= initialDay - 1; e++ ) {
            System.out.print("   ");
        }
        for (int i = StartOfMonth; i <= EndOfMonth; i++) {
            int Day = getDaysOfWeek(month, year, i);
            if (i >= 1 && i <= 9) {
                System.out.print("0" + i + " ");
            }else {
                System.out.print(i + " ");
            }
            if (Day == 7) {
                System.out.println();
            }
        }
    }
}
