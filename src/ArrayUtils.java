/***
 * Утилитный класс для работы с массивом int
 */
public class ArrayUtils {
    /***
     * Циклически перемещает элементы массива
     * @param intArray массив int
     * @param position позиция сдвига
     * @return результирующий массив
     */
    public static int[] cyclicMoveIntArray(int[] intArray, int position) {
        int oldPosition;
        int newPosition;
        int temp;
        if (position != 0) {
            for (int i = 0; i < getGCD(intArray.length, position); i++) {
                temp = intArray[i];
                oldPosition = i;

                while (true) {
                    newPosition = oldPosition + position;
                    if (newPosition >= intArray.length) {
                        newPosition = newPosition - intArray.length;
                    }

                    if (newPosition == i)
                        break;

                    intArray[oldPosition] = intArray[newPosition];
                    oldPosition = newPosition;
                }
                intArray[oldPosition] = temp;
            }
        }
        return intArray;
    }

    private static int getGCD(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return getGCD(n2, n1 % n2);
    }
}
