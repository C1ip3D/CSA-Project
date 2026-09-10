public class NumberRiddle {
    public static void main(String[] args) {
        int startingNumber = 20;
        int intPos = 2;
        int intPosCopy = 2;
        int intNeg = -2;
        int intNegCopy = -2;
        int zeroTest = 0;
        int zeroTestCopy = 0;
        int oneTest = 1;
        int oneTestCopy = 1;
        double posDouble = 9.7;
        double posDoubleCopy = 9.7;
        double negDouble = -6.7;
        double negDoubleCopy = -6.7;

        System.out.println(intPos);
        System.out.println(intNeg);
        System.out.println(zeroTest);
        System.out.println(oneTest);
        System.out.println(posDouble);
        System.out.println(negDouble);

        intPos *= 2;
        intNeg *= 2;
        zeroTest *= 2;
        oneTest *= 2;
        posDouble *= 2;
        negDouble *= 2;

        System.out.println(intPos);
        System.out.println(intNeg);
        System.out.println(zeroTest);
        System.out.println(oneTest);
        System.out.println(posDouble);
        System.out.println(negDouble);

        intPos += 6;
        intNeg += 6;
        zeroTest += 6;
        oneTest += 6;
        posDouble += 6;
        negDouble += 6;

        System.out.println(intPos);
        System.out.println(intNeg);
        System.out.println(zeroTest);
        System.out.println(oneTest);
        System.out.println(posDouble);
        System.out.println(negDouble);

        intPos /= 2;
        intNeg /= 2;
        zeroTest /= 2;
        oneTest /= 2;
        posDouble /= 2;
        negDouble /= 2;

        System.out.println(intPos);
        System.out.println(intNeg);
        System.out.println(zeroTest);
        System.out.println(oneTest);
        System.out.println(posDouble);
        System.out.println(negDouble);

        intPos -= intPosCopy;
        intNeg -= intNegCopy;
        zeroTest -= zeroTestCopy;
        oneTest -= oneTestCopy;
        posDouble -= posDoubleCopy;
        negDouble -= negDoubleCopy;

        System.out.println(intPos);
        System.out.println(intNeg);
        System.out.println(zeroTest);
        System.out.println(oneTest);
        System.out.println(posDouble);
        System.out.println(negDouble);
    }
}
