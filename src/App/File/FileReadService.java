package App.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadService {
    public String readFromFile(String fileName) throws FileNotFoundException {
        try (FileInputStream fis = new FileInputStream(FileConfig.BASE_PATH + fileName + ".txt")) {
            byte[] contentBytes = new byte[fis.available()];
            fis.read(contentBytes);
            return new String(contentBytes);

        } catch (IOException e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}