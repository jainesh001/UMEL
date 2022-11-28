package WhileAndDoWhile;

public class PracOne {
    public static void main(String[] args) {
        int number=4;
        int finishNumber=20;
        int count=0;
        do{
            if(count>=5){
                break;
            }
            if(isEvenNumber(number)){
                System.out.println(number);
                count++;

            }
            number++;
        }while(number<=finishNumber);
    }
    public static boolean isEvenNumber(int number){
        if(number%2==0){
            return true;
        }
        return false;
    }
}
