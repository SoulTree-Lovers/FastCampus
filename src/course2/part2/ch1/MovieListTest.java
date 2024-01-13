package course2.part2.ch1;

import course2.part2.ch1.model.Movie;
import java.util.ArrayList;

public class MovieListTest {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(new Movie("괴물", "봉준호", "2006", "한국"));
        movies.add(new Movie("기생충", "봉준호", "2019", "한국"));
        movies.add(new Movie("완벽한 타인", "이재규", "2018", "한국"));

        for (Movie movie: movies) {
            System.out.println(movie);
        }

        System.out.println("+----------------+--------+-------+------+");
        System.out.println("+영화감독           |감독     |개봉연도  |국가   |");
        System.out.println("+----------------+--------+-------+------+");
        for (Movie movie: movies) {
            System.out.printf("|%-16s|%-8s|%-4s|%-6s|", movie.getTitle(), movie.getDirector(), movie.getYear(), movie.getCountry());
            System.out.println();
        }
        System.out.println("+----------------+--------+-------+------+");

        String searchTitle = "기생충";
        for (Movie movie: movies) {
            if (movie.getTitle().equals(searchTitle)) {
                System.out.println(movie);
                break;
            }
        }
    }
}
