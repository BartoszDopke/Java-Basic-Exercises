public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;
            long years =  (hours / 24) / 365;
            long days = ((hours / 24) - (years*365));
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
