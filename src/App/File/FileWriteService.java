package App.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteService {
    public void WriteToFile(String fileName, String content) throws FileNotFoundException {
        try (FileOutputStream fos = new FileOutputStream(FileConfig.BASE_PATH + fileName + ".txt")) {
            byte[] contentBytes = content.getBytes();
            fos.write(contentBytes);
            System.out.println("Файл успішно створено та записано.");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

