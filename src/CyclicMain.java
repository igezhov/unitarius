import java.util.Arrays;

public class CyclicMain {
    static int[] intArray = {1, 2, 3, 4, 5, 6};

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(ArrayUtils.cyclicMoveIntArray(intArray, 3))
        );
    }
}
