package Spring03.dao;

import Spring03.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Author hujuncong
 * @Title: StudentImpl
 * @Package Spring03.dao
 * @Date 2022/5/9 23:37
 */

@Repository(value = "StudentDao")
public class StudentDaoImpl implements StudentDao{
    @Value(value = "gaohui")
    private String name;
    @Value(value = "13")
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String getInfo() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
