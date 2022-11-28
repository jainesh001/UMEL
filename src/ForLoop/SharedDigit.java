package ForLoop;

import java.util.ArrayList;
import java.util.List;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(15,55));
    }
    public static boolean hasSharedDigit(int a, int b){
        if((a>=10 && a<=99) && (b>=10 && b<=99)){
            List listA=extractRemainder(a);
            List listB=extractRemainder(b);
            for(int i=0;i<listA.size();i++){
                for(int j=0;j<listB.size();j++){
                    if(listA.get(i)==listB.get(j)){
//                        System.out.println(listA.get(i));
                        return true;
                    }
                }
            }

        }else{
            return false;
        }
        return false;
    }
    public static List extractRemainder(int a){
        List list=new ArrayList<>();
        while (a>0){
            int remainder=a%10;
            list.add(remainder);
            a=a/10;
        }
        return list;
    }
}
//alternate solution
//      for(int i = num1; i > 0; i /= 10) {
//            for(int j = num2; j > 0 ; j /= 10) {
//                if(i % 10 == j % 10){
//                    return true;
//                }
//            }
//        }