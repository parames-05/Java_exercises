import java.util.ArrayList;
import java.util.Arrays;
public class bubble_sort {
    public static void bubbleSort(ArrayList<Integer> arr) {
        for (int i = 0; i <= arr.size() - 2; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.size() - 1 - i; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);

                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>(Arrays.asList(11, 21, 31, 41, 10, 20, 30, 40));
        bubbleSort(data);
        System.out.println("Sorted Array:");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}
