package Solution03;

import Solution02.Student;

import java.sql.Connection;
import java.util.List;

/**
 * @Description: StudentDAO的实现类
 * @Author hujuncong
 * @Title: StudentDAOImpl
 * @Package Solution03
 * @Date 2022/5/1 00:53
 */
public class StudentDAOImpl extends BaseDAO implements StudentDAO{
    @Override
    public void insert(Connection conn, Student student) {
        String sql="INSERT INTO students (sid, college, name, date) VALUES (?,?,?,?);";
        update(conn,sql,student.getSid(),student.getCollege(),student.getName(),student.getDate());
    }

    @Override
    public void deleteBySid(Connection conn, int sid) {
        String sql="DELETE FROM students WHERE sid = ?";
        update(conn,sql,sid);
    }

    @Override
    public List<Student> selectByCollege(Connection conn, String college) {
        String sql="SELECT name,sid,college FROM students where college=?";
        try {
            return select(conn,Student.class,sql,college);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int getCountByCollege(Connection conn, String college) {
        String sql="SELECT COUNT(*) FROM students WHERE college=?";
        Number num=getValue(conn,sql,college);
        return num.intValue();
    }
}
