package Spring06.Dao;

import Spring06.Dao.OrderDao;

/**
 * @Description:
 * @Author hujuncong
 * @Title: OrderDaoImpl
 * @Package Spring06
 * @Date 2022/5/10 16:59
 */
public class OrderDaoImpl implements OrderDao {
    @Override
    public void add() {
        System.out.println("正在执行add()方法");
    }

    @Override
    public void delete() {
        System.out.println("正在执行delete()方法");
    }

    @Override
    public int modify() {
        System.out.println("正在执行modify()方法");
        return 0;
    }

    @Override
    public void get() {
        System.out.println("正在执行get()方法");
    }
}
