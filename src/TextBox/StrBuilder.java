package TextBox;

public class StrBuilder {
    public static void main(String[] args) {
        String hw = "Hello " + "James";
        hw.concat(" and Neena");
        StringBuilder stringBuilder = new StringBuilder("Hello " + "James");
        stringBuilder.append(" and Neena");
        printInformation(hw);
        printInformation(stringBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(32));
        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));
        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder builderPlus = new StringBuilder("Hello " + "James");
        builderPlus.append(" and Neena");

        builderPlus.deleteCharAt(16).insert(16, 'g');
        System.out.println(builderPlus);

        builderPlus.replace(16, 17, "G");
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);

        StringBuilder builderP = new StringBuilder();
        builderP.setLength(6);
        System.out.println(builderP);

    }

    public static void printInformation(String string) {
        System.out.println("String= " + string);
        System.out.println("length= " + string.length());
    }

    public static void printInformation(StringBuilder builder) {
        System.out.println("StringBuilder= " + builder);
        System.out.println("length= " + builder.length());
        System.out.println("capacity= " + builder.capacity());
    }
}
