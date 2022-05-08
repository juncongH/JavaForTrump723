package Spring02.StaticProxy;

import static org.junit.Assert.*;

public class AccountProxyTest {
    public static void main(String[] args) {
        //创建目标对象
        AccountService account=new AccountServiceImpl();
        //代理目标对象
        AccountProxy proxy=new AccountProxy(account);
        proxy.getMoney();
    }
}