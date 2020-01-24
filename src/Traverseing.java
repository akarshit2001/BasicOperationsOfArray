public class Traverseing {
    public int[] traversing(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 1;
        }
        return array;
    }
}
