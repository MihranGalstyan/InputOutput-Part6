import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Main {
    public static void main(final String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Bob", "Van", 2.4));
        cats.add(new Cat("Huk", "Kush", 1.4));
        cats.add(new Cat("Nude", "Dos", 2.6));
        cats.add(new Cat("Gosh", "Van", 3.6));

        File directory = new File("Cats");
        directory.mkdir();

        File catsFile = new File("Cats/catsFile.cat");
        try {
            catsFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(catsFile))) {
            outputStream.writeObject(cats);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(catsFile))) {
            List<Cat> loadedCats = (List<Cat>) inputStream.readObject();
            for (final Cat cat : loadedCats) {
                System.out.println(cat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
