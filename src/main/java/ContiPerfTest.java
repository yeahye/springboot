import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author yejunnan
 * @version 1.0
 * @className ContiPerfTest
 * @date 2020/11/6 15:48
 */
public class ContiPerfTest {
    public static void main(String[] args) {
//        ArrayList<Object> list = new ArrayList<>();
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(1);
//        List<Object> objects = list.subList(0, 2);
//        objects.get(0);
//        System.out.println("end");
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("SS");
//        Date date = new Date();
//        System.out.println(date);
//        String format = simpleDateFormat.format(date);
//        System.out.println(format);
        int[] twoTarget = getTwoTarget(new int[]{2, 7, 11, 15}, 9);
        System.out.println();
    }

    public static int[] getTwoTarget(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }
                if (arr[i] + arr[j] == value) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }


}