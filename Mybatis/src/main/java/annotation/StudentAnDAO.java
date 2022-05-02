package annotation;

import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import static org.apache.ibatis.mapping.SqlCommandType.INSERT;

/**
 * The interface Student an dao.
 *
 * @Description: 采用注解方式完成增删改查
 * @Author hujuncong
 * @Title: StudentDAO1
 * @Package annotation
 * @Date 2022 /5/2 21:05
 */
public interface StudentAnDAO {

    /**
     * Insert.
     *
     * @param id      the id
     * @param sid     the sid
     * @param name    the name
     * @param college the college
     * @param date    the date
     */
    @Insert("INSERT INTO students (id,sid,name,college,date) values (#{id},#{sid},#{name},#{college},#{date})")
    void insert(@Param("id")int id, @Param("sid")int sid, @Param("name")String name, @Param("college")String college,@Param("date") LocalDate date);

    /**
     * Update.
     *
     * @param sid  the sid
     * @param name the name
     */
    @Update("UPDATE students SET name=#{name} WHERE sid=#{sid}")
    void updateNameBySid(@Param("sid")int sid,@Param("name")String name);

    /**
     * Delete.
     *
     * @param sid the sid
     */
    @Delete("DELETE FROM students WHERE sid=#{sid}")
    void deleteBySid(@Param("sid")int sid);

    /**
     * Select list.
     *
     * @param college the college
     * @return the list
     */
    @Select("SELECT * FROM students WHERE college=#{college}")
    List<Student> selectByCollege(@Param("college")String college);
}
