import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName HashMapTest
 * @Description TODO
 * @Author yejunnan
 * @Date 2019/6/13 19:02
 * @VERSION 1.0
 */
public class HashMapTest {

    private static Map<String, Method> cacheMap = new HashMap<>();

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        HashMap<Object, Object> map = new HashMap<>();
        Proxy proxy = new Proxy();
        for (int i = 0; i < 2; i++) {
            if (cacheMap.isEmpty()) {
                Method runMethod = Proxy.class.getDeclaredMethod("run");
                cacheMap.put("run", runMethod);
                runMethod.invoke(proxy);
            } else {
                Method run = cacheMap.get("run");
                run.invoke(proxy);
            }
        }
    }

    static class User {
        private String name;
        private String sex;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }
    }

    static class Proxy {
        public void run() {
            System.out.println("run");
        }
    }
}
