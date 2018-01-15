import java.util.Arrays;

/* Exerciţiul 2
Trebuie să creat un program care va sorta şirul dat şi la ieşire va da
şirul vechi şi cel nou:
int[] array = {1, 5, 33, 563, 0, 2, 23, 9, 9, 11, 987, 23,
934, 999, 43};
 */
public class Homework12 {
    public static void main(String[] Andrei) {
        int array[] = {1, 5, 33, 563, 0, 2, 23, 9, 9, 11, 987, 23, 934, 999, 43};
        System.out.println("This is the unsorted array: "+Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("This is the sorted array: "+Arrays.toString(array));
    }
}
