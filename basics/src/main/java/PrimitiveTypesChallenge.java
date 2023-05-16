public class PrimitiveTypesChallenge {

    public static void main(String[] args) {
        byte myByte = 4;
        short myShort = 6;
        int myInt = 10;
        long myLong = 50000L + (10 * (myByte + myShort + myInt));
        short shortTotal = (short) (1000 + (10 * (myByte + myShort + myInt)));
    }
}
