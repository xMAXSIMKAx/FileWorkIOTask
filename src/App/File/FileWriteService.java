package App.File;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteService {
    public String writeToFile(String fileName, String content) {
        try (FileOutputStream fos = new FileOutputStream(FileConfig.BASE_PATH + fileName + ".txt")) {
            byte[] contentBytes = content.getBytes();
            fos.write(contentBytes);
            return "Файл успішно створено та записано.";

        } catch (IOException e) {
            e.printStackTrace();
            return "Помилка при створенні або записі файлу.";
        }
    }

}

