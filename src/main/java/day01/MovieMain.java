package day01;

public class MovieMain {

    public static void main(String[] args) {

        Movie movie = new Movie("Titaic", 1997);

        movie.addActor(new Actor("Dicaprio", 1974));
        movie.addActor(new Actor("Kate Winslet", 1975));
        movie.addActor(new Actor("Bill Paxton", 1955));

        System.out.println(movie.actorsInTheirTwenties());
    }
}
