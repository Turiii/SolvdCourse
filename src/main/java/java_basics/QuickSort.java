package java_basics;
public class QuickSort {

    public static void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            //left side
            quickSort(arr, begin, partitionIndex-1);

            //right side
            quickSort(arr, partitionIndex+1, end);
        }
    }

    private static int partition(int arr[], int begin, int end) {
        //pivot as last element
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                //left side swap
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        //right side swap
        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        quickSort(array, 0, array.length - 1);

        for (int num : array) {
            System.out.print(num + " ");
        }
    }


}