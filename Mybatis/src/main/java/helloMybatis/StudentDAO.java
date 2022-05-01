package helloMybatis;

import java.util.List;

/**
 * The interface Student dao.
 *
 * @Description:
 * @Author hujuncong
 * @Title: StudentDAO
 * @Package helloMybatis
 * @Date 2022 /5/1 14:15
 */
public interface StudentDAO {
    /**
     * Select student list.
     *
     * @return the list
     */
    List<Student> selectStudent();
}
