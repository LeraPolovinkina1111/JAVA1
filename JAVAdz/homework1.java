
public class homework1 {
    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false
        printString("abcd", 5); // abcdabcdabcdabcdabcd
        System.out.println(isLeapYear(1900)); // false

        int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x],[0, 0, 0, 1]]
        int x = array[2][3];
        System.out.println(createArray(1,3));
    }

    private static boolean isSumBetween10And20(int a, int b) {

        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }

    }

    private static boolean isPositive(int x) {
        if (x > 0) {
            return true;
        } else {
            return false;
        }

    }

    private static void printString(String source, int repeat) {
        int z = 0;
        while (z < repeat) {
            System.out.println(source);
            z++;
        }
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static int[] createArray(int len, int initalValue) {

        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initalValue;
        }
        return arr;
    }

}