package files.reading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class Reader {

    public static List<String> readFileToList(String directory) {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(directory)))) {
            ArrayList<String> contents = new ArrayList<String>();
            String line = reader.readLine();
            
            while (line != null) {
                contents.add(line);
                line = reader.readLine();
            }
            return contents;
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    public static String[] readFileToArray(String directory) {
        List<String> contentList = readFileToList(directory);
        return (String[]) contentList.toArray();
    }
}