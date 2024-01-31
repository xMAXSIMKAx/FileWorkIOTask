package App.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadService {
    public void readFromFile(String fileName) throws FileNotFoundException {
        try (FileInputStream fis = new FileInputStream(FileConfig.BASE_PATH + fileName + ".txt")) {
            byte[] contentBytes = new byte[fis.available()];
            fis.read(contentBytes);
            String content = new String(contentBytes);
            System.out.println("Зміст файлу:\n" + content);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
