package Spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class LifeCycleBeanTest {
    public static void main(String[] args) throws Exception {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean01.xml");
        LifeCycleBean lifeCycleBean= (LifeCycleBean) context.getBean("lifecycle");
        System.out.println("获取Bean实例化对象");
        lifeCycleBean.destroy();
    }
}