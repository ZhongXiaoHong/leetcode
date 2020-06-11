package sort;

public class BubbleSort {


    public static void main(String[] args) {
        int[] array = new int[]{5, 2, 3, 6, 9, 8, 7, 4, 1, 0};
        new BubbleSort().sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public void sort(int array[]) {

        for (int i = 0; i < array.length - 1; i++) { //一共有array.length-1趟

            for (int j = 0; j < array.length - i - 1; j++) {//每一趟的比较次数：array.length -i- 1

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }


    }
}
