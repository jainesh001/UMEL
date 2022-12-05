package ForLoop;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
//        int num=1;
//        int num2=2;
//        System.out.println(Math.round((double)num/num2));
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int count=0;
        long avg=0;
        while(true){
            try {
                String number = sc.nextLine();
                int num = Integer.parseInt(number);
                count++;
                sum=sum+num;
            }catch (NumberFormatException e){
                avg=Math.round((double)sum/count);
                System.out.println("SUM = "+sum+ " AVG = "+avg);
                break;
            }
        }
    }
}
