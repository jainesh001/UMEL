package ForLoop;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
    }
    public static int sumFirstAndLastDigit(int number){
        int sum=0;
        int count=0;
        if(number<0){
            return -1;
        }else {
            while (number > 0) {
                int remainder = number % 10;
//                System.out.println("number: " + number);
//                System.out.println("remainder: " + remainder);
                if (count == 0) {
                    sum = sum + remainder;
                }
                if(number<10){
                    sum = sum + remainder;
                }
                count++;
                number = number / 10;
            }
        }
        return sum;
    }
}
