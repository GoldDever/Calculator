public class RomeNumbers {

    public static int romanToInteger(String r){
        int t;
        switch (r) {
            case "I" :
                t = 1;
                break;
            case "II":
                t = 2;
                break;
            case "III":
                t = 3;
                break;
            case "IV":
                t = 4;
                break;
            case "V":
                t = 5;
                break;
            case "VI":
                t = 6;
                break;
            case "VII":
                t = 7;
                break;
            case "VIII":
                t = 8;
                break;
            case "IX":
                t = 9;
                break;
            case "X":
                t = 10;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + r);
        }
        return t;
    }

    public static void integerToRoman(int g) {

        String s = "";

        while (g == 100) {
            s += "C";
            g -= 100;
        }
        while (g >= 90) {
            s += "XC";
            g -= 90;
        }
        while (g >= 50) {
            s += "L";
            g -= 50;
        }
        while (g >= 40) {
            s += "XL";
            g -= 40;
        }
        while (g >= 10) {
            s += "X";
            g -= 10;
        }
        while (g >= 9) {
            s += "IX";
            g -= 9;
        }
        while (g >= 5) {
            s += "V";
            g -= 5;
        }
        while (g >= 4) {
            s += "IV";
            g -= 4;
        }
        while (g >= 1) {
            s += "I";
            g -= 1;
        }
        System.out.println(s);
    }
}
