package Spring02.DynamicProxy;

import java.lang.reflect.Proxy;

import static org.junit.Assert.*;

public class AccountAdviceTest {
    public static void main(String[] args) {
        AccountService account = new AccountServiceImpl();
        AccountService proxy = (AccountService) Proxy.newProxyInstance(account.getClass().getClassLoader(), account.getClass().getInterfaces(), new AccountAdvice(account));
        proxy.getMoney();
    }
}