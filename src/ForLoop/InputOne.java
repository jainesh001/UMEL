package ForLoop;

import java.util.Scanner;

public class InputOne {
    public static void main(String[] args) {
        int currentYear=2022;
        String users="1999";
        int usersInt=Integer.parseInt(users);
        System.out.println(currentYear-usersInt);
        try{
            String name=System.console().readLine("Enter name: ");
            System.out.println("Entered name is: "+name);
        }
        catch (NullPointerException e){
            System.out.println(alternateMethod());
        }
    }
    public static String alternateMethod(){
        System.out.println();
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();

        return "Entered name is: "+name;
    }

}
