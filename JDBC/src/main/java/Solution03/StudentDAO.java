package Solution03;

import Solution02.Student;

import java.sql.Connection;
import java.util.List;

/**
 * The interface Student dao.
 *
 * @Description: 声明Student表的数据库操作
 * @Author hujuncong
 * @Title: StudentDAO
 * @Package Solution03
 * @Date 2022 /5/1 00:29
 */
public interface StudentDAO {
    /**
     * Insert.
     *
     * @param conn    the conn
     * @param student the student
     */
    void insert(Connection conn, Student student);

    /**
     * Delete by sid.
     *
     * @param conn the conn
     * @param sid  the sid
     */
    void deleteBySid(Connection conn,int sid);

    /**
     * Select by college list.
     *
     * @param conn    the conn
     * @param college the college
     * @return the list
     */
    List<Student> selectByCollege(Connection conn, String college);

    /**
     * Gets count by college.
     *
     * @param conn    the conn
     * @param college the college
     * @return the count by c ollege
     */
    int getCountByCollege(Connection conn,String college);
}
