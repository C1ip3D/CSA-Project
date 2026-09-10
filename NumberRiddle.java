// class definition "Number Riddle" that creates the program.
public class NumberRiddle {
    // main method for the class.
    public static void main(String[] args) {
        // starting number and test cases (integers and doubles) defined, as well as their copies for final calculations.
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
        // print out the original values.
        System.out.println(intPos);
        System.out.println(intNeg);
        System.out.println(zeroTest);
        System.out.println(oneTest);
        System.out.println(posDouble);
        System.out.println(negDouble);
        // multiply all values by 2.
        intPos *= 2;
        intNeg *= 2;
        zeroTest *= 2;
        oneTest *= 2;
        posDouble *= 2;
        negDouble *= 2;
        /// print out the product by multiplying by 2.
        System.out.println(intPos);
        System.out.println(intNeg);
        System.out.println(zeroTest);
        System.out.println(oneTest);
        System.out.println(posDouble);
        System.out.println(negDouble);
        // add 6 to all values.
        intPos += 6;
        intNeg += 6;
        zeroTest += 6;
        oneTest += 6;
        posDouble += 6;
        negDouble += 6;
        // print out the result of adding by 6.
        System.out.println(intPos);
        System.out.println(intNeg);
        System.out.println(zeroTest);
        System.out.println(oneTest);
        System.out.println(posDouble);
        System.out.println(negDouble);
        // divide all values by 2.
        intPos /= 2;
        intNeg /= 2;
        zeroTest /= 2;
        oneTest /= 2;
        posDouble /= 2;
        negDouble /= 2;
        // print out the results by dividing by 2.
        System.out.println(intPos);
        System.out.println(intNeg);
        System.out.println(zeroTest);
        System.out.println(oneTest);
        System.out.println(posDouble);
        System.out.println(negDouble);
        // subtract the original value, using the copy variable, from all current values.
        intPos -= intPosCopy;
        intNeg -= intNegCopy;
        zeroTest -= zeroTestCopy;
        oneTest -= oneTestCopy;
        posDouble -= posDoubleCopy;
        negDouble -= negDoubleCopy;
        // print out the final result.
        System.out.println(intPos);
        System.out.println(intNeg);
        System.out.println(zeroTest);
        System.out.println(oneTest);
        System.out.println(posDouble);
        System.out.println(negDouble);
    }
}
