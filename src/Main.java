import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<SimpleMovie> movies = MovieDatabaseBuilder.getMovieDB("src/movie_data");
        System.out.print("Enter an actor, and we'll find their connection to Kevin Bacon! ");
        String actorName = scan.nextLine();
        for (int i = 0; i < movies; i++) {
            if ()
        }
        ArrayList<SimpleMovie> tempMovies = ArrayList<SimpleMovie>();
    }
}