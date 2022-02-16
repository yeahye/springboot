//package pool;
//
//import com.mchange.v2.c3p0.DataSources;
//
//import javax.sql.DataSource;
//import java.lang.reflect.Field;
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
///**
// * @Auther: yejunnan
// * @Date: 2018/10/25 11:11
// * @Description:
// */
//public class DataSourcePoolTest {
//
//        public static void main(String[] args) {
//            try {
//                Class.forName("com.mysql.jdbc.Driver");
//                DataSource unpooled = DataSources.unpooledDataSource("jdbc:mysql://localhost:3306/mysql", "root", "root");
//                DataSource pooled = DataSources.pooledDataSource(unpooled);
//                Connection con = null;
//                Statement stmt = null;
//                ResultSet rs = null;
//                con = pooled.getConnection();
//                System.out.println("con Class Type is:" + con.getClass().getName());
//                Object inner1 = getInnter(con);
//                System.out.println("Inner con Class Type is:" + inner1.getClass().getName());
//                stmt = con.createStatement();
//                rs = stmt.executeQuery("select * from user");
//                while(rs.next()) {
//                    System.out.println("Data from Db:" + rs.getString(1));
//                }
//                rs.close();
//                stmt.close();
//                con.close();
//                Thread.sleep(1000);
//                con = pooled.getConnection();
//                Object inner2 = getInnter(con);
//                if(inner1 == inner2) {
//                    System.out.println("same");
//                }
//                stmt = con.createStatement();
//                rs = stmt.executeQuery("select * from user");
//                while(rs.next()) {
//                    System.out.println("Data from Db:" + rs.getString(1));
//                }
//                rs.close();
//                stmt.close();
//                con.close();
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            } finally {
//            }
//
//        }
//
//
//    public static Object getInnter(Object con) {
//        Object re = null;
//        Field f;
//        try{
//            f = con.getClass().getDeclaredField("inner");
//            f.setAccessible(true);
//            re = f.get(con);        //取得内部包装的Connection
//            f.setAccessible(false);
//        } catch (Exception e) {
//        }
//        return re;
//    }
//}
