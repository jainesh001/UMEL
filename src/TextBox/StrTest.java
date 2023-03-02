package TextBox;

public class StrTest {
    public static void main(String[] args) {
        printInformation("Hello");
        printInformation("");
        printInformation("\t     \n");
        String hw = "New w world";
        System.out.printf("index of r= %d %n", hw.indexOf('r'));
        System.out.printf("index of or= %d %n", hw.indexOf("or"));
        System.out.printf("first index of w = %d %n", hw.indexOf('w'));
        System.out.printf("last index of w = %d %n", hw.lastIndexOf('w'));
        //if we want search for second w instead of first
        System.out.printf("second index of w = %d %n", hw.indexOf('w', 3));
        //if we want search for second last w instead of last
        System.out.printf("second index of w = %d %n", hw.lastIndexOf('w', 5));

        String helloWorldLower = hw.toLowerCase();
        if (helloWorldLower.equals(hw)) {
            System.out.println("Value Matches exactly");
        }
        if (helloWorldLower.equalsIgnoreCase(hw)) {
            System.out.println("Value Matches ignoring case");
        }
        if (helloWorldLower.startsWith("new")) {
            System.out.println("Starts with new");
        }
        if (helloWorldLower.endsWith("world")) {
            System.out.println("ends with world");
        }
        if (helloWorldLower.contains("world")) {
            System.out.println("contains world");
        }
        if (helloWorldLower.contentEquals("new w world")) {
            System.out.println("content matches exactly");
        }


    }

    public static void printInformation(String s) {

        int length = s.length();
        System.out.printf("Length = %d %n", length);
        if (s.isEmpty()) {
            System.out.println("Empty");
            System.out.println("--------");
            return;
        }
        if (s.isBlank()) {
            System.out.println("Blank");
        }
        System.out.printf("First Character = %c %n", s.charAt(0));
        System.out.printf("Last Character = %c %n", s.charAt(length - 1));

        System.out.println("--------");

    }

}
