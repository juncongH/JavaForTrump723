package Spring06.Dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class OrderAspect01Test {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        OrderDao orderDao = context.getBean("orderDao", OrderDao.class);
        orderDao.add();
        orderDao.delete();
        orderDao.modify();
        orderDao.get();
    }
}