package Polymorphism.Movie;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){
        String instanceType=this.getClass().getSimpleName();
        System.out.println(title+ " is a "+instanceType + " film");
    }

    //Example of factory method in software designing patterns
    // (where it returns new instance of object),
    // Factory methods gives us a way to get a object without having to know
    //The details of how to create one using the exact class we want
    public static Movie getMovie(String type,String title){
        return switch (type.toUpperCase().charAt(0)){
            case 'A'-> new Adventure(title);
            case 'C'-> new Comedy(title);
            case 'S'-> new ScienceFiction(title);
            case 'H'-> new Horror(title);
            default -> new Movie(title);
        };
    }

}

class Adventure extends Movie{
    public Adventure(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens");
    }

    public void watchAdventure(){
        System.out.println("Watching adventure");
    }

}

class Comedy extends Movie{
    public Comedy(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(4),
                "Funny Scene",
                "Funny Music",
                "Something Funny Happens",
                "Happy Ending");
    }

    public void watchComedy(){
        System.out.println("Watching Comedy");
    }

}

class ScienceFiction extends Movie{
    public ScienceFiction(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(5),
                "Science Scene",
                "No Music",
                "Planet destroyed",
                "Assemble",
                "regroup");
    }
    public void watchScienceFiction(){
        System.out.println("Watching ScienceFiction");
    }
}

