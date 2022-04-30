package Utils;

import Solution02.Student;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @Description: 封装JDBC常用方法：连接、释放资源、增删改、查询
 * @Author hujuncong
 * @Title: JDBCUtils
 * @Package Solution02.Utils
 * @Date 2022/4/30 22:42
 */
public class JdbcUtils {
    public Connection getConnection() {
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

    public void closeResource(Connection conn, PreparedStatement stat) {
        try {
            if (stat != null) {
                stat.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeResource(Connection conn, PreparedStatement stat, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (stat != null) {
                stat.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Connection connection, String sql, Object... args) {
        PreparedStatement state = null;
        try {
            connection = getConnection();
            state = connection.prepareStatement(sql);

            for (int i = 0; i < args.length; i++) {
                state.setObject(i + 1, args[i]);
            }
            state.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeResource(connection, state);
        }
    }

    public Student select(Connection connection, String sql, Object... args) {
        PreparedStatement state = null;
        ResultSet resultSet = null;
        try {
            connection = getConnection();
            state = connection.prepareStatement(sql);

            for (int i = 0; i < args.length; i++) {
                state.setObject(i + 1, args[i]);
            }
            resultSet = state.executeQuery();
            ResultSetMetaData rsmd = resultSet.getMetaData();
            int columnCount = rsmd.getColumnCount();

            if (resultSet.next()) {
                Student student = new Student();
                for (int i = 0; i < columnCount; i++) {
                    String columnName = rsmd.getColumnLabel(i + 1);
                    Object value = resultSet.getObject(i + 1);
                    Field field = student.getClass().getDeclaredField(columnName);
                    field.setAccessible(true);
                    field.set(student, value);
                }
                return student;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeResource(connection, state, resultSet);
        }
        return null;
    }

    /**
     *
     * 采用泛型的方式，构建可查询不同表结构的通用查询操作，返回一系列查询结果
     *
     */
    public <T> List<T> selectT(Connection conn, Class<T> clazz, String sql, Object... args) {
        PreparedStatement state=null;
        ResultSet result=null;

        try {
            state=conn.prepareStatement(sql);

            for (int i = 0; i < args.length; i++) {
                state.setObject(i+1,args[i]);
            }
            result = state.executeQuery();
            ResultSetMetaData rsmd=result.getMetaData();

            ArrayList<T> list=new ArrayList<>();
            int columnCount=rsmd.getColumnCount();
            while (result.next()){
                T t= clazz.getDeclaredConstructor().newInstance();
                for (int i = 0; i < columnCount; i++) {
                    Object columnValue=result.getObject(i+1);
                    String columnName=rsmd.getColumnLabel(i+1);
                    Field field=clazz.getDeclaredField(columnName);
                    field.setAccessible(true);
                    field.set(t,columnValue);
                }
                list.add(t);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeResource(conn,state,result);
        }
        return  null;
    }
}
