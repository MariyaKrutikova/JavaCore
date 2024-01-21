/*Написать метод, возвращающий количество чётных элементов массива*/

public class СountEvens {
    public static void countEvens(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                count = count + 1;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int [] arr = new int[]{1,3};
        countEvens(arr);
    }
}
