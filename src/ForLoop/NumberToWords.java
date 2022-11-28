package ForLoop;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(0);
//        extractor(1234);
    }

    public static void extractor(int number) {
        while (number > 0) {
            int remainder = number % 10;
            System.out.println("number: " + number);
            System.out.println("reminder: " + remainder);
            number = number / 10;

        }
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            int reverseNumber = reverse(number);
            int tempReverseNumber = reverseNumber;
            while (reverseNumber > 0) {
                int remainder = reverseNumber % 10;
                reverseNumber = reverseNumber / 10;
                switch (remainder) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("OTHER");
                        break;
                }
            }
            if (getDigitCount(number) != getDigitCount((reverseNumber))) {
                int difference = getDigitCount(number) - getDigitCount(tempReverseNumber);
                while (difference > 0) {
                    System.out.println("Zero");
                    difference--;
                }
            }
        }
    }

    public static int reverse(int number) {
        boolean flag = false;
        if (number < 0) {
            number = Math.abs(number);
            flag = true;
        }
        int newNumber = 0;
        while (number > 0) {
            int remainder = number % 10;
            number = number / 10;
            newNumber = (newNumber * 10) + remainder;
        }
        if (flag) {
            newNumber = (newNumber - (newNumber * 2));
        }
        return newNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else {
            int count = 0;
            if (number == 0) {
                return 1;
            }
            while (number > 0) {
                int remainder = number % 10;
                number = number / 10;
                count++;
            }
            return count;
        }
    }
}
