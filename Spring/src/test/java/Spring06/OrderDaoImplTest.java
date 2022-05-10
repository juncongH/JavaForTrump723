package Spring06;

import Spring06.Dao.OrderDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderDaoImplTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean04.xml");
        OrderDao orderDao = context.getBean("orderDao", OrderDao.class);
        orderDao.add();
        orderDao.delete();
        orderDao.modify();
        orderDao.get();
    }
}