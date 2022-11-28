package ForLoop;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(5));
    }
    public static boolean isPerfectNumber(int number){
        if(number<1){
            return false;
        }else {
            int total=0;
            for(int i=1;i<number;i++){
                if(number%i==0){
                    total=total+i;
                }
            }
            if(total==number){
                return true;
            }else{
                return false;
            }
        }
    }
}
