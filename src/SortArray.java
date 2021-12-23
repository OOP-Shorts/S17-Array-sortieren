import java.util.Arrays;

public class SortArray {

    /*
        Sortieren Sie das übergebene Array in aufsteigender Reiehenfolge.
        Geben Sie ein neu erstelltes sortiertes Array zurück.
     */
    public static int[] sortArray(int[] values) {
        return null;
    }

    public static void main(String[] args) {
        int[] toSort = {5, 6, 2, 4, 3, 1};
        int[] sorted = sortArray(toSort);

        int[] test = {1, 2, 3, 4, 5, 6};

        if(Arrays.equals(sorted, test)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Your Array is: " + Arrays.toString(sorted) + "; but it should be: " + Arrays.toString(test));
        }

    }
}
