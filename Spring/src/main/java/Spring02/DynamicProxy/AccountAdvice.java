package Spring02.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description: 对于静态代理而言，每一个业务增强都需要写一个Proxy代理类，由代理类创建代理对象，太麻烦了；动态代理采用反射机制，直接生成代理对象
 * @Author hujuncong
 * @Title: AccountAdvice
 * @Package Spring02.DynamicProxy
 * @Date 2022/5/8 09:55
 */
public class AccountAdvice implements InvocationHandler {
    private AccountService account;

    public AccountAdvice(AccountService account){
        this.account=account;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        return method.invoke(account,args);
    }

    private void before(){
        System.out.println("身份验证");
    }
}
