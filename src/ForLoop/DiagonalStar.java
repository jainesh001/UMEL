package ForLoop;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        }
        int rowCount = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if (i == 1 || j == 1 || i == number || j == number) {
                    System.out.print("*");
                } else if (i == j) {
                    System.out.print("*");
                } else if (j==(number-i+1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
//                if(i==8 && j==8 ){
////                    System.out.print("*");
////                }
            }
            rowCount = rowCount + 1;
            System.out.println("");
        }
    }
}
