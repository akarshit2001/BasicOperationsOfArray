public class Insert {
    public int[] insertinArray(int[] array, int num, int pos) {
        int[] arr = new int[array.length + 1];
        for (int i = 0; i < array.length + 1; i++) {
            if (i < pos - 1) {
                arr[i] = array[i];
            } else if (i == pos - 1) {
                arr[i] = num;
            } else if (i > pos - 1) {
                if (i - 1 > 0)
                    arr[i] = array[i - 1];
            }
        }
        return arr;
    }
}