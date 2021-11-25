import java.util.*;
public class ConversionUsingHashMap {
    public static void main(String[] args) {
        long binaryNumber = 110;
        int octalNumber = convertToOctal(binaryNumber);
        System.out.println(binaryNumber + " in binary is equal to " + octalNumber + " in octal.");
    }

    public static int convertToOctal(long binaryNumber) {
        int octal = 0, decimal = 0, a = 0;
        while (binaryNumber != 0) {
            decimal += (binaryNumber % 10) * Math.pow(2, a);
            ++a;
            binaryNumber /= 10;
        }
        a = 1;
        while (decimal != 0) {
            octal += (decimal % 8) * a;
            decimal /= 8;
            a *= 10;
        }
        return octal;
    }
}
