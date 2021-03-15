package mor.edu.module1;

/**
 * @author Antonina Moroz
 * @version 1.0.0
 * @project vsem
 * @class LaboratoryWork1
 * @since 15.03.2021 - 18.06
 **/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LaboratoryWork1 {

    public static void main(String[] args) throws IOException {

        // download a text version of a novel about Harry Potter to string

        String text = new String(Files.readAllBytes(Paths.get("/Users/User/Desktop/Java/harry.txt")));

        String[] lines = text.split("\\n");

        System.out.println(lines.contains("Harry"));

        String string = text;
        String[] parts = string.split(" C");

        for (int i = 0; i < parts.length; i++) {
            String[] word = parts[i].split(" ");

            if (i > 0) {
                System.out.println("C" + word[0]);
            } else {
                for (int j = 0; j < word.length; j++) {

                    if (word[j].startsWith("c") || word[j].startsWith("C"))
                        System.out.println(word[j]);

                    text = text.replaceAll("[^A-Za-z ']", "");

                    String[] words = text.split(" ");

                    String[] hash = words.hashCode();


                }

            }
        }
    }
}
