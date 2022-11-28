package ForLoop;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-12321));
    }
    public static boolean isPalindrome(int number){
        number=Math.abs(number);
        System.out.println(number);
        int temp=number;
        int reverse=0;
        while(temp>0){
            int remainder=temp%10;
            System.out.println("number: " + temp);
            System.out.println("remainder: " + remainder);
            reverse=((reverse*10)+remainder);
            System.out.println("new string: " + reverse);
            temp= temp/10;

        }
        if(number==reverse){
            return true;
        }
        return false;
    }

}
