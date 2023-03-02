package Polymorphism.Movie;

public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();


        //Here we know "A" will return adventure that is the reason we are casting here;
        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        //If there is any other class coming from this factory method it will throw class cast exception
//        Adventure movie1= (Adventure) Movie.getMovie("X","Jaws");
//        movie1.watchMovie();

        //This line works fine because any object is a child class of object.
        //The compiler won't use the method return type, to figure out what
        //comedy really is, after you make this assignment. It just assumes it's an Object, and this variable
        //only has access to Object's functionality.
        //   Object comedy = Movie.getMovie("C", "Airplane");
        //  comedy.watchMovie();// here we are looking for watchmovie() in Object base class which object class doesn't have
        //Now, you could assign every instance to
        //an Object reference like this, but you  wouldn't be able to do much with them,
        //without casting them to other typed references. In other words, to run watchMovie on comedy
        //(which has the type Object),  we'd have to cast it to a Movie.

        Object comedyNew = Movie.getMovie("C", "Airplane");
        Movie comedyN = (Movie) comedyNew;
        comedyN.watchMovie();
//        comedyN.watchComedy();//Method specific to comedy class can not be accessed by Movie class

        //The compiler will only look at the reference  type, to determine if that method is on that type,

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();
        System.out.println("***");

        Object unknownObject = Movie.getMovie("S", "Airplane");
        if (unknownObject.getClass().getSimpleName().equals("Comedy")) {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }

    }
}
