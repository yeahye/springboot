package JVM;

import java.util.Date;

/**
 * @ClassName People
 * @Description TODO
 * @Author yejunnan
 * @Date 2019/6/12 15:54
 * @VERSION 1.0
 */
public class People {

    private String name;

    private String date;

    public People() {

    }

    public People(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
