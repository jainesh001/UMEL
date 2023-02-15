package Polymorphism.Movie;

public class Horror extends Movie {
    public Horror(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Horror Scene",
                "Dark Music",
                "Silent");
    }


}