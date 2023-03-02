package TypeOne;

public class ExerciseOne {
    public static void main(String[] args) {
        int k = 65;
        char val = (char) k;
        switch (k) {
            case 'A':
                System.out.println(('A'));
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            case 'D':
                System.out.println("D");
                break;
            case 'E':
                System.out.println("E");
                break;
            default:
                System.out.printf("Not found");
        }

//        for(int i =0 ; i< 60000;i++){
//            char c=(char)i;
//            System.out.println(i+":--> "+c);
//        }
    }

}
