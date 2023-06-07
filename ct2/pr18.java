import java.util.*;

public class pr18 {
    public static void main(String[] args) {
        int[] MyArray= {1, 2, 5, 8, 4, 66, 8};
        int  MaxIndex = 0;

        for (int i = 1; i < MyArray.length; i++) {
            if (MyArray[i] > MyArray[MaxIndex]) {
                MaxIndex = i;
            }
        }

        int[] LeftArray = Arrays.copyOfRange(MyArray, 0, MaxIndex);
        int[] RightArray = Arrays.copyOfRange(MyArray, MaxIndex + 1, MyArray.length);

        System.out.println("Исходный массив: " + Arrays.toString(MyArray));
        System.out.println("Max элемент: " + MyArray[MaxIndex]);
        System.out.println("Элементы слева от Max: " + Arrays.toString(LeftArray));
        System.out.println("Элементы справа от Max: " + Arrays.toString(RightArray));

    }
}