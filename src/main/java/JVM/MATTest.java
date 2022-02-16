package JVM;

import java.util.*;

/**
 * @ClassName MATTest
 * @Description TODO
 * @Author yejunnan
 * @Date 2019/6/12 15:53
 * @VERSION 1.0
 */
public class MATTest {
//    public static void main(String[] args) {
//        System.out.println("hello");
//        oom();
//    }
//
//    private static void oom(){
//        Map<String, People> map = new HashMap<String, People>();
//        Object[] array = new Object[1000000];
//        int i = 0;
//        while (true) {
//            String d = new Date().toString();
//            People s = new People("test", d);
//            map.put(i+"_oom", s);
//            array[i] = s;
//            i++;
//        }
//    }

    static class TestObject {
        public byte[] placeholder = new byte[1024 * 1024];
    }

    public static void checkOOM(int num) throws InterruptedException {
        List<TestObject> list = new ArrayList<TestObject>();
        for (int i = 0; i < num; i++) {
            Thread.sleep(1000);
            //每次清空list,保证回收
//            if (num % 20 == 0) {
//                list.clear();
//            }
            list.add(new TestObject());
            System.out.println("add" + i);
        }
    }

    public static void main(String[] args) throws Exception {
//        checkOOM(100);
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
//        accept(strings);
//        while(true){
////            Thread.sleep(5000);
//            System.out.println("running");
//        }
    }

    public static void accept(ArrayList<Object> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
