package Spring03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @Description: 基于注解的bean配置
 * @Author hujuncong
 * @Title: Student
 * @Package String03
 * @Date 2022/5/9 23:08
 */
@Component(value = "student")
public class Student {
    @Qualifier(value = "gaohui")
    private String name;
    @Qualifier(value = "1")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
