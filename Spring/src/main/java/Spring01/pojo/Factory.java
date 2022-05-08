package Spring01.pojo;

/**
 * @Description:
 * @Author hujuncong
 * @Title: Factory
 * @Package Spring01.pojo
 * @Date 2022/5/8 22:25
 */
public class Factory {
    private String FactoryName;

    public String getFactoryName() {
        return FactoryName;
    }

    public void setFactoryName(String factoryName) {
        FactoryName = factoryName;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "FactoryName='" + FactoryName + '\'' +
                '}';
    }
}
