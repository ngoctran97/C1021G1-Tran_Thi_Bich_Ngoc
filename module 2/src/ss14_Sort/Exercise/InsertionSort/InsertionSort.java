package ss14_Sort.Exercise.InsertionSort;

public class InsertionSort {
    static int[] array =  {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void InsertionSort(int[] array){
        int pos, x;
        for (int i = 0; i < array.length; i++){
            x = array[i];
            pos = i ;
            while (pos > 0 && x < array[pos - 1]){
                array[pos] = array[pos -1 ];
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        InsertionSort(array);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
