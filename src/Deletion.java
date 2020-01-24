public class Deletion {
    public int[] deleteElementInArray(int[] array, int pos) {
        int[] newArray = new int[array.length - 1];
        for (int i = 0, k = 0; i < array.length; i++) {
            if (pos - 1 < 0 || pos - 1 > array.length - 1) {
                return array;

            } else if (i == pos - 1) {
                continue;
            }
            newArray[k++] = array[i];


        }
        return newArray;
    }
}
