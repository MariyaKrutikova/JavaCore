package homeWork5;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;


/* 1. Написать функцию, создающую резервную копию всех файлов в директории(без поддиректорий)
    во вновь созданную папку ./backup */
public class FileBackupInCurrentDirectory {
    public static void CreateFileBackupAppache() {
           File sourceDir = new File(".");
           File targetDir = new File("backup1");
           try {
               FileUtils.copyDirectory(sourceDir, targetDir);
          }
           catch (IOException e) {
               System.out.println("Ошибка");
           }
    }

    public static void CreateFileBackup(){
        try {
            Path testDirectory = Files.createDirectory(Paths.get("./backup2"));
            DirectoryStream<Path> dir = Files.newDirectoryStream(Path.of("."));
            for (Path file: dir) {
                if (Files.isDirectory(file)) continue;
                Files.copy(file, Path.of("./backup2/" + file.toString()));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
