package ss14_Sort.Exercise.InsertionSortByStep;

public class InsertionSortinsertionSort {
    static int[] array =  {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    public static void InsertionSortinsertionSort(int[] array){
        int pos, x;
        for (int i = 0; i < array.length; i++){
            System.out.println("gan x = " + array[i]);
            x = array[i];
            System.out.println("gan pos = " + i);
            pos = i;
            while (pos > 0 && x < array[pos -1]){
                System.out.println("gan array "+ array[pos] + " = "+ array[pos -1]);
                array[pos] = array[pos -1];
                pos--;
            }
            array[pos] = x;
        }
    }
    public static void main(String[] args) {
        InsertionSortinsertionSort(array);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
