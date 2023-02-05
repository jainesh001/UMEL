package TextBox;

public class StrTest {
    public static void main(String[] args) {
        printInformation("Hello");
        printInformation("");
        printInformation("\t     \n");
        String hw="New world";
        System.out.printf("index of r= %d %n", hw.indexOf('r'));
        System.out.printf("index of or= %d %n", hw.indexOf("or"));
    }
    public static void printInformation(String s) {

        int length = s.length();
        System.out.printf("Length = %d %n", length);
        if(s.isEmpty()){
            System.out.println("Empty");
        }
        if(s.isBlank()){
            System.out.println("Blank");
        }
        System.out.println("--------");
        System.out.printf("First Character = %c %n", s.charAt(0));
        System.out.printf("Last Character = %c %n", s.charAt(length-1));


    }

}
