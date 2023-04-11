package files.writing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public final class Writer {
    
    public static void writeArrayToFile(String[] contents, String directory) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(new File(directory)))) {
            for (String line : contents) {
                writer.write(line);
                writer.newLine();
                writer.flush();
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeListToFile(List<String> contents, String directory) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(new File(directory)))) {
            for (String line : contents) {
                writer.write(line);
                writer.newLine();
                writer.flush();
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
