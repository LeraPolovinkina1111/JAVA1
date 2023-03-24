// public class program {
    //     public static void main(String[] args) {
    //         int[] array = { 1, 1, 0, 1, 1, 1 };
    
    //         int curr = 0;
    //         int best = 0;
    //         for (int i = 0; i < array.length; i++) {
    //             int a = array[i];
    //             if (a == 1) {
    //                 curr++;
    
    //             } else {
    //                 if (curr > best) {
    //                     best = curr;
    //                 }
    //                 curr = 0;
    
    //             }
    //             if (curr > best) {
    //                 best = curr;
    //             }
    //         }
    //         System.out.println(best);
    //     }
    // }
    
    /**
     * program
     */
    public class sem1 {
        public static void main(String[] args) {
            int[] array = { 3, 2, 2, 3, 1, 5, 5, 3, 3 };
            int val = 3;
    
            swap(array, val);
    
            for (int x : array) {
                System.out.println(x + " ");
            }
    
        }
    
        static void swap(int[] array, int val) {
            int size = array.length;
            int shift = 1;
            for (int i = 0; i < size - shift ; i++) {
                while (array[size - shift] == val) {
                    shift++;
                }
    
                if (array[i] == val) {
                    int tmp = array[i];
                    array[i] = array[size - 1];
                    array[size - 1] = tmp;
                    shift++;
                }
    
            }
    
        }
    }
    
    