package ForLoop;

public class FlourPacker {
    public static void main(String[] args) {
//        System.out.println(canPack(1,0,4));
//        System.out.println(canPack(1,0,5));
//        System.out.println(canPack(0,5,4));
//        System.out.println(canPack(2,2,11));
//        System.out.println(canPack(2,2,13));
//        System.out.println(canPack(2,2,5));
        System.out.println(canPack(0, 5, 5));
        System.out.println(canPack(2, 10, 18));


    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
//
//        if(bigCount==0 && smallCount>0){
//            if(goal%1==0 && (smallCount>=goal/1)){
//                return true;
//            }
//        }else if(smallCount==0 && bigCount>0){
//            if(goal%5==0 && (bigCount>=goal/5)){
//                return true;
//            }
//        }
        int remainderBigBag = goal % 5;
        int division = goal / 5;
        if ((bigCount >= division || smallCount >= (remainderBigBag + ((division - bigCount) * 5))) && smallCount >= remainderBigBag) {
            return true;
        } else {
            return false;
        }


        //alternate
//        while (bigCount > 0 && goal >= 5) { // #2 subtract 5 from goal for each bigCount
//            goal -= 5;
//            bigCount--;
//        }
//        return smallCount >= goal; // #3 make sure enough smallCount to fill remaining goal

//alternate
//        int bigCountToUse = bigCount < goal/5 ? bigCount : goal/5 ; // #2 determine how many bigCount to use
//        return (goal - bigCountToUse*5) <= smallCount; // #3 evaluate if enough smallCount to fill the rest of the order
//
    }
}
