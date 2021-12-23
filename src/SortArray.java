import java.util.Arrays;

public class SortArray {

    /*
        Sortieren Sie das übergebene Array in aufsteigender Reiehenfolge.
        Geben Sie ein neu erstelltes sortiertes Array zurück.
     */
    public static int[] sortArray(int[] values) {
        // Arrays die leer sind oder nur ein Element enthalten können nicht sortiert werden.
        if(values == null || values.length == 0 || values.length == 1) {
            System.out.println("Array to short to sort.");
            return values;
        }

        // um das übergebene Array nicht zu verändern wird es vor jeglicher Veränderung kopiert.
        int[] toSort = Arrays.copyOf(values, values.length);
        // Es wird ein neues sortiertes Array angelegt.
        int[] sorted = new int[toSort.length];

        // Alle Stellen des neuen Arrays sollen befüllt werden, daher braucht es eine for-Schleife über die Länge dieses Arrays.
        for (int i = 0; i < sorted.length; i++) {
            int minValue = Integer.MAX_VALUE;
            int indexOfMinValue = -1;
            // Für jede Stelle des sortierten Arrays wird die aktuell kleinste Zahl im zu sortierenden Array gesucht.
            for (int j = 0; j < toSort.length; j++) {
                if(toSort[j] < minValue) {
                    minValue = toSort[j];
                    indexOfMinValue = j;
                }
            }
            // Die kleinste Zahl wird an die aktuelle Position des sortierten Arrays gespeichert.
            sorted[i] = minValue;
            // Die vorher kleinste Zahl wird ersetzt, damit sie im nächsten Durchgang nicht wieder die kleinste ist.
            toSort[indexOfMinValue] = Integer.MAX_VALUE;
        }

        return sorted;
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
