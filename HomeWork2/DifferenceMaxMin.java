/*Написать функцию, возвращающую разницу
между самым большим и самым маленьким элементами
переданного не пустого массива*/

import java.util.Arrays;

import static java.util.Arrays.stream;

public class DifferenceMaxMin {
    public static void diffMaxMin(int[] arr){
        if (arr.length == 0) {
            System.out.println("Пустой массив");
        }
        else
            System.out.println(Arrays.stream(arr).max().getAsInt() - Arrays.stream(arr).min().getAsInt());

    }
    public static void main(String[] args) {
        int [] arr1 = new int[] {-1,2,3,4,5,6};
        int [] arr2 = new int[0];
        diffMaxMin(arr1);
        diffMaxMin(arr2);
    }
}
