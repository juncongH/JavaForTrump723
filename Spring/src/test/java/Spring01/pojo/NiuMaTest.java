package Spring01.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class NiuMaTest {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
        NiuMa niuma= (NiuMa) context.getBean("NiuMa");
        System.out.println(niuma.toString());
    }
}