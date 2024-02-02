package homeWork5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class AddPrefixToFileName {
    public static void addPrefix(String prefix, String[] filesName) {
        for (String fileName : filesName) {
            Path file = Path.of("C:/Users/apple/OneDrive/Рабочий стол/ОбучениеJava/JAVACORE/Seminar5/src/main/java/homeWork5/" + fileName);
            System.out.println(Files.exists(file));
            System.out.println(file);
            if (Files.exists(file)) {
                try {
                    Files.move(file, Paths.get("C:/Users/apple/OneDrive/Рабочий стол/ОбучениеJava/JAVACORE/Seminar5/src/main/java/homeWork5/"+prefix + fileName), REPLACE_EXISTING);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.printf("No file with name '%s'", fileName);
            }
        }
    }
}


