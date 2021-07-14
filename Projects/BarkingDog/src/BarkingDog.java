public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourofDay) {
        if (!barking || hourofDay < 0 || hourofDay > 23 || (hourofDay > 7 && hourofDay < 23)) {
            return false;
        }

        return true;
    }
}
