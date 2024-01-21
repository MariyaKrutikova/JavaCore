/*Написать функцию, возвращающую истину, если в переданном массиве есть два
  соседних элемента, с нулевым значением*/
public class IsTwoNullElements {
    public static void isTwoNullElements(int[] arr) {
        boolean flag = true;
        int i = 0;
        while (flag && i < arr.length-1) {
            if (arr[i] == 0 & arr[i + 1] == 0) {
                flag = false;
                System.out.println("true");
            } else i = i + 1;
        }
        if (flag) System.out.println("false");
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 0, 0, 3, 0};
        int[] arr2 = {0, 1, 2, 3, 0, 6};
        isTwoNullElements(arr1);
        isTwoNullElements(arr2);
    }
}