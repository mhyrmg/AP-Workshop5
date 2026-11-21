

public class Main {

    public static void assertResult(int result, int expected) {
        if (result != expected) {
            System.out.printf("%nAssertionError: %d != %d%n", result, expected);
            System.exit(1);
        } else {
            System.out.print('.');
        }
    }
    public static void main(String[] args) {
        assertResult(AUTMath.sum(2, 4), 6);
        assertResult(AUTMath.subtract(2, 4), -2);
        assertResult(AUTMath.multiply(3, 4), 12);
        assertResult(AUTMath.multiply(-3, 5), -15);
        assertResult(AUTMath.divide(8, 4), 2);
        // هندل کردن تقسیم بر صفر
        try {
            AUTMath.divide(4, 0);
            System.out.println("\nAssertionError: Expected ArithmeticException");
            System.exit(1);
        } catch (ArithmeticException e) {
            System.out.print('.'); // تست پاس شد
        }
        assertResult(AUTMath.factorial(4), 24);
        assertResult(AUTMath.pow(2, 4), 16);
    }
}