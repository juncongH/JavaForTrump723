package Spring01.pojo;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author hujuncong
 * @Title: NiuMa
 * @Package Spring01.pojo
 * @Date 2022/5/8 22:24
 */
public class NiuMa {
    private String name;
    private Factory factory;
    private List<String> hobbies;
    private Map<String,String> info;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Factory getFactory() {
        return factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
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
        return "NiuMa{" +
                "name='" + name + '\'' +
                ", factory=" + factory.toString() +
                ", hobbies=" + hobbies +
                ", info=" + info +
                '}';
    }
}
