package review.example.v9.tryWithCatchNewFeature;

import java.io.*;

public class MultipleResourcesExample {
    public static void main(String[] args) {
        BufferedReader reader;
        BufferedWriter writer;
        try {
            reader = new BufferedReader(new FileReader("file1.txt"));
            writer = new BufferedWriter(new FileWriter("file2.txt"));

            // Managing both resources together
            try (reader; writer) {
                String line;
                while ((line = reader.readLine()) != null) {
                    writer.write(line);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
