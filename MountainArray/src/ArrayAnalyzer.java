public class ArrayAnalyzer {
    public static boolean isMountainArray(int[] array) {
        int arrLen = array.length;
        if (arrLen < 3) {
            return false;
        }
        boolean isIncreasing = true;
        for (int i = 0; i < arrLen - 1; i++) {
            if (!isIncreasing && array[i] <= array[i + 1]) {
                return false;
            }
            if (array[i] > array[i + 1]) {
                isIncreasing = false;
            }
            else if (array[i] == array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isMountainArray(new int[]{0, 3, 2, 1}));
    }
}
