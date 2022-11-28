package ForLoop;

public class GreatestCommonDivisorO {
    public static void main(String[] args) {
        getGreatestCommonDivisor(25,15);
    }
    public static int getGreatestCommonDivisor(int first, int second){
        if(first<10 || second<10){
            return -1;
        }
        else{
            int target=Math.min(first,second);
            for(int i=target;i>=1;i--){
                if(first%i==0 && second%i==0){
                    return i;
                }
            }
        }
        return -1;
    }

}
