package Spring05.dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description:
 * @Author hujuncong
 * @Title: JDKProxy
 * @Package Spring05.dao
 * @Date 2022/5/10 16:14
 */
public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces={UserDao.class};
        UserDaoImpl userDao=new UserDaoImpl();
        UserDao user= (UserDao) Proxy.newProxyInstance(UserDao.class.getClassLoader(),interfaces,new UserDaoProxy(userDao));
        user.login();
    }
}

class UserDaoProxy implements InvocationHandler {
    private Object obj;

    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("login功能执行前");

        Object res=method.invoke(obj,args);
        System.out.println("login功能执行");

        System.out.println("login功能执行后");
        System.out.println("身份验证");
        return res;
    }
}
