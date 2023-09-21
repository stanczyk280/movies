package dust.movies;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> movieList() {
        return movieRepository.findAll();
    }

    public Optional<Movie> movie(String imdbId){
        return movieRepository.getMovieByImdbId(imdbId);
    }
}
