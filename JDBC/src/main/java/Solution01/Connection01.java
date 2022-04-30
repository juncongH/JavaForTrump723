package Solution01;

import java.sql.*;

/**
 * @Description: jdbc连接数据库基础操作，这是最基础最笨的方法
 * @Author hujuncong
 * @Title: Connection
 * @Package Solution01
 * @Date 2022/4/3021:59
 */
public class Connection01 {
    /**
     * Update.连接数据库，增删改语句
     */
    public void update(){
        java.sql.Connection connection = null;
        PreparedStatement state = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String psd = "hujuncong";
            connection = DriverManager.getConnection(url,user,psd);

            String sqlState = "Update students set college='资环' where sid=?";
            state = connection.prepareStatement(sqlState);

            String sid = "2019124";
            state.setString(1, sid);
            state.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(state!=null){
                    state.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if(connection!=null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
