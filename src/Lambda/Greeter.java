package Lambda;

public class Greeter {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        //here I am passing behavior(we are passing a thing that has behavior) to greet method
        // classic object-oriented programming(Polymorphism)
        //option to pass the action instead of class that has action
//        greeter.greet(hwGreeting);
        //Lambda is basically an direct implementation function passed of its method in below format
        MyLambda greetingLambdaFunction = () -> {
            return 1 + 2;
        };


        Greeting hwGreet = new HWGreeting();
        hwGreet.perform();
        //this like creating an implementation of Greeting interface
        Greeting gs = () -> System.out.println("New");
        Greeting annoymusExp = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Anonymous");
            }
        };
        greeter.greet(hwGreet);
        greeter.greet(gs);
        greeter.greet(annoymusExp);

        MyAdd add = (int a, int b) -> a + b;

        // when we are using
    }

    //what if want greet method to provide input , one way is to provide argument and based
    //on the argument do either this or that
    // Good approach can have the behavior itself passed as an argument, so greet method doesnt contain any behavior
    //it takes the behavior and executes it
    public void greet(Greeting greeting) {
        greeting.perform();
    }
}

interface MyLambda {
    int foo();
}

interface MyAdd {
    int add(int x, int y);
}
