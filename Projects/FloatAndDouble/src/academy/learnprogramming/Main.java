package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum Value = " + myMinFloatValue);
        System.out.println("Float maximum Value = " + myMaxFloatValue);

        Double myMinDoubleValue = Double.MIN_VALUE;
        Double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum Value = " + myMinDoubleValue);
        System.out.println("Double maximum Value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue =  5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted kilograms= " + convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}