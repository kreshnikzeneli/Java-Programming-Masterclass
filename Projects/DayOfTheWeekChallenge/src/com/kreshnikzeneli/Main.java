package com.kreshnikzeneli;

public class Main {

    public static void main(String[] args) {

        printDayOfTheWeek(-1);
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);

        printNumberInWord(0);

    }

//    Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.
//
//    The method should not return any value (hint: void)
//
//    Using a switch statement print gSundayh, gMondayh, c ,gSaturdayh if the int parameter gdayh is 0, 1, c , 6 respectively, otherwise it should print gInvalid dayh.
//
//    Bonus:
//    Write a second solution using if then else, instead of using switch.
//    Create a new project in IntelliJ with the  name gDayOfTheWeekChallengeh

    private static void printDayOfTheWeek(int day) {

        if(day == 0) {
            System.out.println("Sunday");
        } else if (day ==1) {
            System.out.println("Monday");
        } else if (day ==2) {
            System.out.println("Tuesday");
        } else if (day ==3) {
            System.out.println("Wednesday");
        } else if (day ==4) {
            System.out.println("Thursday");
        } else if (day ==5) {
            System.out.println("Friday");
        } else if (day ==6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");
        }




//        switch (day) {
//            case 0:
//                System.out.println("Sunday");
//                break;
//
//            case 1:
//                System.out.println("Monday");
//                break;
//
//            case 2:
//                System.out.println("Tuesday");
//                break;
//
//            case 3:
//                System.out.println("Wednesday");
//                break;
//
//            case 4:
//                System.out.println("Thursday");
//                break;
//
//            case 5:
//                System.out.println("Friday");
//                break;
//
//            case 6:
//                System.out.println("Saturday");
//                break;
//
//            default:
//                System.out.println("Invalid day");
//                break;
//        }
    }

    public static void printNumberInWord (int number) {

        switch (number) {

            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;

            case 2:
                System.out.println("TWO");
                break;

            case 3:
                System.out.println("THREE");
                break;

            case 4:
                System.out.println("FOUR");
                break;

            case 5:
                System.out.println("FIVE");
                break;

            case 6:
                System.out.println("SIX");
                break;

            case 7:
                System.out.println("SEVEN");
                break;

            case 8:
                System.out.println("EIGHT");
                break;

            case 9:
                System.out.println("NINE");
                break;

            default:
                System.out.println("OTHER");
                break;
        }
}
}
