public class SpeedConverter {

    public static long toMilesPerHours(double kilometersPerHour) {

        if(kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHours) {

        if(kilometersPerHours < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHours(kilometersPerHours);
            System.out.println(kilometersPerHours + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
