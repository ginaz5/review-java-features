package review.example.v12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileCompare {

    public static void main(String[] args) throws IOException {
        Path pathA = Files.createFile(Paths.get("File1.txt"));
        Path pathB = Files.createFile(Paths.get("File2.txt"));

        Files.write(pathA,"Test write".getBytes(), StandardOpenOption.WRITE);
        Files.write(pathB,"Test write".getBytes(), StandardOpenOption.WRITE);
        // mismatch - determining if two files are identical or at which byte they differ.
        long mismatch = Files.mismatch(pathA, pathB);
        System.out.println(mismatch);

        Files.write(pathA,"123".getBytes(), StandardOpenOption.APPEND);
        Files.write(pathB,"321".getBytes(), StandardOpenOption.APPEND);
        mismatch = Files.mismatch(pathA, pathB);
        System.out.println(mismatch);

        pathA.toFile().deleteOnExit();
        pathB.toFile().deleteOnExit();
    }
}
