package Solution03;

import Utils.JdbcUtils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @Description: 存储操作数据库的通用方法（考虑事务机制）
 * @Author hujuncong
 * @Title: BaseDAO
 * @Package Solution03
 * @Date 2022/5/1 00:19
 */
public class BaseDAO {
    public Connection getConnection(){
        try {
            String rootDir = JdbcUtils.class.getClassLoader().getResource("").getPath();
            String filepath = rootDir + "Solution02.properties";
            InputStream is = new BufferedInputStream(new FileInputStream(filepath));
            Properties config = new Properties();
            config.load(is);

            String url = config.getProperty("url");
            String user = config.getProperty("user");
            String psd = config.getProperty("password");
            String driverClass = config.getProperty("driverClass");

            Class.forName(driverClass);

            return DriverManager.getConnection(url, user, psd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public void update(Connection conn, String sql, Object... args) {
        PreparedStatement state = null;
        try {
            state = conn.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                state.setObject(i + 1, args[i]);
            }
            state.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public <T> List<T> select(Connection conn, Class<T> clazz, String sql, Object... args) {
        PreparedStatement stat = null;
        ResultSet result = null;
        JdbcUtils utils=new JdbcUtils();

        try {
            conn = utils.getConnection();
            stat = conn.prepareStatement(sql);

            for (int i = 0; i < args.length; i++) {
                stat.setObject(i + 1, args[i]);
            }
            result = stat.executeQuery();
            ResultSetMetaData rsmd = result.getMetaData();
            ArrayList<T> list = new ArrayList<>();
            int columnCount = rsmd.getColumnCount();
            while (result.next()) {
                T t = clazz.getDeclaredConstructor().newInstance();
                for (int i = 0; i < columnCount; i++) {
                    Object columnvalue = result.getObject(i + 1);
                    String columnName = rsmd.getColumnLabel(i + 1);
                    Field field = clazz.getDeclaredField(columnName);
                    field.setAccessible(true);
                    field.set(t, columnvalue);
                }
                list.add(t);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            utils.closeResource(conn, stat, result);
        }
        return null;
    }

    public <E> E getValue(Connection conn, String sql, Object... args) {
        PreparedStatement stat = null;
        ResultSet result = null;
        JdbcUtils utils=new JdbcUtils();

        try {
            conn = utils.getConnection();
            stat = conn.prepareStatement(sql);

            for (int i = 0; i < args.length; i++) {
                stat.setObject(i + 1, args[i]);
            }
            result = stat.executeQuery();
            if (result.next()) {
                return (E) result.getObject(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            utils.closeResource(conn, stat, result);
        }
        return null;
    }
}
