package Spring02.StaticProxy;

/**
 * @Description: AOP的静态代理演示，这里举一个取钱的例子
 * 如果没有身份验证，声明+Impl操作DAO就可以完成，但是现在要加一个身份验证的业务，为了不修改底层代码，采用静态代理
 * @Author hujuncong
 * @Title: AccountService
 * @Package Spring02.StaticProxy
 * @Date 2022/5/8 09:19
 */
public interface AccountService {
    /**
     * Gets money.取钱操作声明
     */
    void getMoney();
}
