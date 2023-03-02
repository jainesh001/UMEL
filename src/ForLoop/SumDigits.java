package ForLoop;

public class SumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(756789));
    }

    public static int sumDigits(int number) {
        int total = 0;
        int loopCount = 0;
        if (number >= 10) {
            while (number > 0) {
                loopCount = loopCount + 1;
                int remainder = number % 10;
                System.out.println("number: " + number);
                System.out.println("remainder: " + remainder);
                number = number / 10;
                total = total + remainder;
            }
//            total=total+number;
        } else {
            return -1;
        }
        System.out.println("loop count: " + loopCount);
        return total;
    }

}
