public class Updation {
    public int[] updateArray(int[] array, int index, int changeValue) {
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                array[i] = changeValue;
            }
        }
        return array;
    }
}
