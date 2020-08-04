public class ArabicNumbers  {



    public static void calculations(int a, int b, char c, int d) throws Exception {

        int result = 0;
        if ((a < 1 || a > 10) || (b < 1 || b > 10)) {
            throw new Exception();
        }
        else if (c == '+') {
            result = a + b;
        } else if (c == '-') {
            result = a - b;
        } else if (c == '*') {
            result = a * b;
        } else if (c == '/') {
            result = a / b;
        }

        if (d == 2) {
            RomeNumbers.integerToRoman(result);
        } else {
            System.out.println(result);
        }
    }
}