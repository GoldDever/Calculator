import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Assigning {
    static int a, b, d;
    static char c;

    public static void assigningVar() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        reader.close();




        if (str.contains("*")) {
            int s = str.indexOf("*");
            try {
                a = Integer.parseInt(str.substring(0, s));
            } catch (Exception e) {
                a = RomeNumbers.romanToInteger(str.substring(0, s));
                d++;
            }
            try {
                b = Integer.parseInt(str.substring(s + 1));
            } catch (Exception e) {
                b = RomeNumbers.romanToInteger(str.substring(s + 1));
                d++;
            }
            if (d == 1) throw new Exception();
            c = str.charAt(s);

        } else if (str.contains("/")) {
            int s = str.indexOf("/");
            try {
                a = Integer.parseInt(str.substring(0, s));
            } catch (Exception e){
                a = RomeNumbers.romanToInteger(str.substring(0, s));
                d++;
            }
            try {
                b = Integer.parseInt(str.substring(s + 1));
            } catch (Exception e) {
                b = RomeNumbers.romanToInteger(str.substring(s + 1));
                d++;
            }
            if (d == 1) throw new Exception();
            c = str.charAt(s);

        } else if (str.contains("-")) {
            int s = str.indexOf("-");
            try {
                a = Integer.parseInt(str.substring(0, s));
            } catch (Exception e) {
                a = RomeNumbers.romanToInteger(str.substring(0, s));
                d++;
            }
            try {
                b = Integer.parseInt(str.substring(s + 1));
            } catch (Exception e) {
                b = RomeNumbers.romanToInteger(str.substring(s + 1));
                d++;
            }
            if (d == 1) throw new Exception();
            c = str.charAt(s);

        } else if (str.contains("+")) {
            int s = str.indexOf("+");
            try {
                a = Integer.parseInt(str.substring(0, s));
            } catch (Exception e) {
                a = RomeNumbers.romanToInteger(str.substring(0, s ));
                d++;
            }
            try {
                b = Integer.parseInt(str.substring(s + 1));
            } catch (Exception e) {
                b = RomeNumbers.romanToInteger(str.substring(s + 1));
                d++;
            }
            if (d == 1) throw new Exception();
            c = str.charAt(s);
        }
    }
}
