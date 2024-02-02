package homeWork5;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        /*Переименование файлов*/
        String[] filesName = {"ClassForAddPrefixOne.java", "ClassForAddPrefixTwo.java"};
        AddPrefixToFileName.addPrefix("", filesName);

        /*Запись чисел в файл в 3 байта*/
        int[] array = {2,0,1,3,0,0,0,1,1};
        WriteNumbersInFile.writeNumbersForThreeBytes(array);

        /*Создание резервной копии файлов. Два способа: обычный и через апач*/
        FileBackupInCurrentDirectory.CreateFileBackup();
        FileBackupInCurrentDirectory.CreateFileBackupAppache();

        /*Удаление созданных файлов*/
        try {
            FileUtils.deleteDirectory(new File("C:/Users/apple/OneDrive/Рабочий стол/ОбучениеJava/JAVACORE/Seminar5/backup2"));
            FileUtils.deleteDirectory(new File("C:/Users/apple/OneDrive/Рабочий стол/ОбучениеJava/JAVACORE/Seminar5/backup1"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
