package ForLoop;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 72));
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (isValid(a) && isValid(b) && isValid(c)) {
            if ((a % 10 == b % 10) || (b % 10 == c % 10) || (a % 10 == c % 10)) {
                return true;
            }
        } else {
            return false;
        }

        return false;
    }

    public static boolean isValid(int a) {
        if ((a >= 10 && a <= 1000)) {
            return true;
        } else {
            return false;
        }
    }


}
