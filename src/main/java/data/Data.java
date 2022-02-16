package data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author yejunnan
 * @version 1.0
 * @className Data
 * @date 2020/11/28 15:27
 */
public class Data {

    public static void main(String[] args) {
//        string();
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
    }

    private static void string() {
        int[] ints = {1};
        int length = ints.length;
        String s = "abc";
        s.length();
        String s1 = "java";

        String s2 = new String("java");

        String s3 = new StringBuffer("java").toString();
        String s4=  "java";
        System.out.println("s1 == s3:" + s1 == s3);
        String s5 = s2.intern();
        System.out.println(s1 == s5);
    }
}
