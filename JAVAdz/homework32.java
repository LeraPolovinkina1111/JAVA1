public class homework32 {
    import java.util.ArrayList;
import java.util.List;

public class homework32 {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        textList1(list1);
        System.out.println(list1);

    }

    private static void textList1(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            try {
                Integer.parseInt(arr.get(i));
                arr.remove(i--);
            } catch (Exception e) {
            }
        }
    }
}
