package ForLoop;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitsSum(123456789));
    }
    public static int getEvenDigitsSum(int number){
        int sum=0;
        if(number<0){
            return -1;
        }else {
            while (number>0){
                int remainder=number%10;
                System.out.println("number: " + number);
                System.out.println("remainder: " + remainder);
                number=number/10;
                if(remainder%2==0){
                    System.out.println("Selected: "+ remainder);
                    System.out.println("Old sum: "+ sum);
                    sum=sum+remainder;
                    System.out.println("New sum: "+ sum);
                }
            }
        }
        return sum;
    }
}
