package Lambda;

public class TypeInferenceExample {
    public static void main(String[] args) {
        //we can remove string as the interface it self have that information(type inference)
//        StringLengthLambda lambda=(s)->s.length();
        // if there is one argument we can remove the() and it is still a valid lambda
        StringLengthLambda lambda = s -> s.length();

//        StringLengthLambda lambda=(String s)->s.length();

        System.out.println(lambda.getLength("Hello Lambda"));
        TypeInferenceExample t = new TypeInferenceExample();
        t.printLambda(lambda);
        //this is known as type inference
        t.printLambda(s -> s.length());


    }

    public void printLambda(StringLengthLambda lambda) {
        System.out.println(lambda.getLength("New"));
    }


}

interface StringLengthLambda {
    int getLength(String s);
}