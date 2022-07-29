import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) throws Exception {
        File file = new File("movies.txt");
        Scanner fileScanner = new Scanner(file);
        ArrayList<String> films = new ArrayList<>();

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            films.add(line);
        }

        Random random = new Random();
        int filmIndex = random.nextInt(films.size());
        String randomFilm = films.get(filmIndex);

        String userGuessed = "_".repeat(randomFilm.length());
        System.out.println(randomFilm);
        System.out.println(userGuessed);
    }

}

