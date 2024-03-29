package review.example.v9.tryWithCatchNewFeature;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesPriorJava9Example {
    public static void main(String[] args) throws FileNotFoundException {
        try (BufferedReader br = new BufferedReader(new FileReader("file1.txt")))
        {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
