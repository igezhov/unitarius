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
        int temp;
        for (int a = 0; a < position; a++) {
            temp = intArray[0];
            for (int i = 0; i < intArray.length - 1; i++) {
                intArray[i] = intArray[i + 1];
            }
            intArray[intArray.length - 1] = temp;
        }
        return intArray;
    }
}
