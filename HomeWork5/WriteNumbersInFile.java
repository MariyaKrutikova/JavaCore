package homeWork5;
/*2. Предположить, что числа в исходном массиве из 9 элементов имеют диапазон[0, 3],
и представляют собой, например, состояния ячеек поля для игры в крестикинолики,
где 0 – это пустое поле, 1 – это поле с крестиком, 2 – это поле с ноликом, 3 – резервное значение.
Такое предположение позволит хранить в одном числе типа int всё поле 3х3.
Записать в файл 9 значений так, чтобы они заняли три байта. */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteNumbersInFile {
    int[] arrray;
    public  static void writeNumbersForThreeBytes(int[] array){
        FileOutputStream fos;
        {
            try {
                fos = new FileOutputStream("file_for_numbers.out");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 3; i++) {
            byte wr = 0;
            for (int j = 0; j < 3; j++) {
                wr += (byte) (array[3 * i + j] << (j * 2));
            }
            try {
                fos.write(wr);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
//        fos.flush();
//        fos.close();
    }
}



