public class Main {

    public static void main(String[] args) {

        double miles = SpeedConverter.toMilesPerHours(80);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(80);
    }
}
