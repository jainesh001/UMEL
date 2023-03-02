package Polymorphism.Movie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Movie movie=Movie.getMovie("Science","Star Wars");
//        movie.watchMovie();s.

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Type (A for adventure, C for comedy," +
                    "S for ScienceFiction, Q to Quit: ");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }

    }
}
