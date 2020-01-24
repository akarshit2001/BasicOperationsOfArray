import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();

        }
        System.out.println("insert element and also give index number");
        int number = sc.nextInt();
        int index = sc.nextInt();
        Insert in = new Insert();
        array = in.insertinArray(array, number, index);
        System.out.println(Arrays.toString(array));
        System.out.println("to delete element at specific position");
        Deletion del = new Deletion();
        int postion = sc.nextInt();
        array = del.deleteElementInArray(array, postion);
        System.out.println("Update the value at particular index");
        Updation up = new Updation();
        int index1 = sc.nextInt();
        int value = sc.nextInt();
        array = up.updateArray(array, index, value);
        System.out.println(Arrays.toString(array));
        Traverseing tr = new Traverseing();
        array = tr.traversing(array);
        System.out.println("Traverse of array");
        System.out.println(Arrays.toString(array));
    }
}
