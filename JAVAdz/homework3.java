public class homework3{

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class homework3{
    public static void main(String[] args) {

        ArrayList<Integer> intNum = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 6, 5, 4, 7, 9, 8));
        evenNum(intNum);
        System.out.println(intNum);
    }

    private static void evenNum(List<Integer> arg) {
        for (int i = 0; i < arg.size(); i++) {
            if (arg.get(i) % 2 != 0) {
                arg.remove(i--);
            }
        }
    }
}
