package Spring02.StaticProxy;

/**
 * @Description: 静态代理类，对AccountService业务增强，继承AccountService接口，并封装一个AccountService对象
 * @Author hujuncong
 * @Title: AccountProxy
 * @Package Spring02.StaticProxy
 * @Date 2022/5/8 09:25
 */
public class AccountProxy implements AccountService {

    private AccountService account;

    public AccountProxy(AccountService account){
        this.account=account;
    }

    @Override
    public void getMoney() {
        before();
        account.getMoney();
    }

    private void before(){
        System.out.println("身份验证");
    }
}
