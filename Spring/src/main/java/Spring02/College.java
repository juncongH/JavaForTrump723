package Spring02;

/**
 * @Description:
 * @Author hujuncong
 * @Title: College
 * @Package Spring02
 * @Date 2022/5/9 22:35
 */
public class College {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "College{" +
                "name='" + name + '\'' +
                '}';
    }
}
