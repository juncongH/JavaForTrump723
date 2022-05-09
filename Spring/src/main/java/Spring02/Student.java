package Spring02;

import java.util.List;
import java.util.Map;

/**
 * @Description: xml方式配置bean
 * @Author hujuncong
 * @Title: Student
 * @Package Spring02
 * @Date 2022/5/9 22:34
 */
public class Student {
    private String name;
    private College college;
    private List<String> hobbies;
    private Map<String,String> info;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Map<String, String> getInfo() {
        return info;
    }

    public void setInfo(Map<String, String> info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", college=" + college.toString() +
                ", hobbies=" + hobbies +
                ", info=" + info +
                '}';
    }
}
