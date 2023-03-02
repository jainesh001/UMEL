package TextBox;

public class StrMethods {
    public static void main(String[] args) {
        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("startingIndex = " + startingIndex);
        System.out.println("birth Year = " + birthDate.substring(startingIndex));
        System.out.println("birth Month= " + birthDate.substring(3, 5));

        String newDate = String.join("/", "25", "11", "1982");
        System.out.println("new Date : " + newDate);

        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("new Date : " + newDate);

        newDate = "25" + "/" + "11" + "/" + "1982";
        System.out.println("new Date : " + newDate);

        //method chaining, this is still creating new String object but not assigning to a variable
        newDate = "25".concat("/").concat("11").concat("/").concat("1982");
        System.out.println("new Date : " + newDate);

        // this kind of operation better class is StringBuilder

        System.out.println(newDate.replace("/", "-"));
        System.out.println(newDate.replace("2", "00"));
        //These methods have regex as search criteria, if we want to replace all occurrences for given string
        //use above replace methods, below method will look for pattern through regular expression
        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replaceAll("/", "----"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("        ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));

    }
}
