package Utils;

import Solution02.Student;
import org.junit.Test;

import java.sql.Connection;

import static org.junit.Assert.*;

public class JdbcUtilsTest {
    @Test
    public void test() {
        JdbcUtils utils=new JdbcUtils();
        Connection conn=utils.getConnection();

        int sid=2019121;
        String sql1="SELECT name,college FROM students WHERE sid=?";
        Student student = utils.select(conn,sql1,sid);
        System.out.println(student.getName()+","+student.getCollege());
        String sql2="UPDATE students SET college='计算机' WHERE sid=?";
        utils.update(conn,sql2,sid);
        String sql3="SELECT name,college FROM students WHERE sid=?";
        student = utils.select(conn,sql3,sid);
        System.out.println(student.getName()+","+student.getCollege());
    }
}