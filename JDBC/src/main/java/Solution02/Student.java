package Solution02;

import java.util.Date;

/**
 * @Description: ResultSet的映射，数据类型和字段名应该和数据库字段对应
 * @Author hujuncong
 * @Title: Student
 * @Package Solution02
 * @Date 2022/4/30 23:04
 */
public class Student {
    private int id;
    private int sid;
    private String college;
    private String name;
    private Date date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
