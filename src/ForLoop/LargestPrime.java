package ForLoop;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime1(45));

    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        for (int i = number/2 ; i > 1; i--) {
            if (number % i == 0 ) {
                boolean flag=true;
                for (int j = 2; j <= i/2; j++) {
                    if (i % j == 0) {
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    return i;
                }
            }
        }
        return number;
    }

    public static int getLargestPrime1(int number) {
        if (number < 2) {
            return -1;
        }
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                number /= i;
                i--;
            }
        }
        return number;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
