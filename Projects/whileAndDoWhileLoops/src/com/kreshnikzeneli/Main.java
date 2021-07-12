package com.kreshnikzeneli;

public class Main {

    public static void main(String[] args) {
//        int count = 1;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        for (int i=6; i!=6; i++) {
//            System.out.println("Count value is " + count);
//        }
//
//        count = 6;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if (count >100) {
//                break;
//            }
//
//        } while (count !=6);

//        int number = 4;
//        int finishNumber = 20;
//
//        while (number <= finishNumber) {
//            number++;
//            if(!isEvenNumber(number)) {
//                continue;
//            }
//
//            System.out.println("Even number " + number);
//        }


        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found


//        int number = 4;
//        int finishNumber = 20;
//        int evenNumbersFound = 0;
//
//        while (number <= finishNumber) {
//            number++;
//            if(!isEvenNumber(number)) {
//                continue;
//            }
//            System.out.println("Even number " + number);
//
//            evenNumbersFound++;
//            if (evenNumbersFound >= 5) {
//                break;
//            }
//        }

     //   System.out.println("Total even numbers found = " + evenNumbersFound);


        // another recap example

        int number = 0;
        while (number < 15) {
            number++;

            if (number <= 15) {
                System.out.println("Skipping number " + number);
                continue;
            }

            System.out.println("number = " + number);

            if (number >= 10) {
                System.out.println("Breaking at " + number);
                break;
            }
        }

    }





    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;

    // Create a method called isEvenNumber that a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

}
