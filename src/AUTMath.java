/**
 * This class is used to perform simple mathematical
 * operations.
 */
public class AUTMath {
    /**
     * addition operator
     * @param num1 operand
     * @param num2 operand
     * @return the sum of two operands
     */
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * subtraction operator
     * @param num1 operand
     * @param num2 operand
     * @return the result of subtracting the second parameter from the first.
     */
    public static int subtract(int num1, int num2) {
        int result = num1 - num2;
//      مشکل اصلی در این خط بود که باعث میشد قدر مطلق تفریق رو برمیگردوند
//      return Math.abs(result);
        return result;
    }

    /**
     * multiplication operator
     * @param num1 multiplicant
     * @param num2 multiplier
     * @return the multiplication of the parameters
     */
    public static int multiply(int num1, int num2) {
        int result = 0;
        // این حلقه به تعداد یکی بیشتر از num2 تکرار میشه
        //ینی در اصل um1 * (num2+1)
        for (int i = 0; i < num2; i++) {
           result += num1;
        }
        return result;
    }

    /**
     * Division operator
     * @param num1 divided
     * @param num2 divisor
     * @return The result of dividing the first parameters by the second parameter
     */
    public static int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return num1 / num2;
    }

    /**
     * Factorial operator
     * @param number operand
     * @return the factorial of the passed in parameter
     */
    public static int factorial(int number) {
        // به دلیل نداشتن این شرط همیشه ضرب در صقر میشد در انتها
        if (number == 1) {
            return 1;
        }
        if (number == 0 ) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    /**
     * power operand
     * @param base the base operator
     * @param power the power operator
     * @return the result of raising the first parameter to the power of the second parameter.
     */
    public static int pow(int base, int power) {
        // به دلیل نداشتن شرط خاتمه همیشه ادامه میداشت
        if (power == 0) {
            return 1;
        }
        return base * pow(base, power - 1);
    }
}
