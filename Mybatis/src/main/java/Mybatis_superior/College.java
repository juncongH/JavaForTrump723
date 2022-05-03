package Mybatis_superior;

import java.util.List;

/**
 * @Description:
 * @Author hujuncong
 * @Title: College
 * @Package Mybatis_superior
 * @Date 2022/5/3 21:12
 */
public class College {
    private String name;
    private String located;

    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocated() {
        return located;
    }

    public void setLocated(String located) {
        this.located = located;
    }
}
