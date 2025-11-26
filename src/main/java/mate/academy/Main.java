package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService =
                (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("The Matrix");
        movie.setDescription("Sci-fi classic");

        Movie savedMovie = movieService.add(movie);
        System.out.println("Saved movie: " + savedMovie);

        Movie foundMovie = movieService.get(savedMovie.getId());
        System.out.println("Found movie by id: " + foundMovie);
    }
}
