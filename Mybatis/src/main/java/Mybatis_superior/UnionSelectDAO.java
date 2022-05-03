package Mybatis_superior;

import java.util.List;

/**
 * The interface Union select dao.
 *
 * @Description: 联合查询
 * @Author hujuncong
 * @Title: UnionSelectDAO
 * @Package Mybatis_superior
 * @Date 2022 /5/3 21:18
 */
public interface UnionSelectDAO {
    /**
     * Select student by located list.
     * 根据学部查各学院学生，一对多查询
     * @param located the located
     * @return the list
     */
    List<College> selectStudentByLocated(String located);

    /**
     * Select all info list.
     * 查询学生所有信息，多对一查询
     * @return the list
     */
    List<Student> selectAllInfo();
}
