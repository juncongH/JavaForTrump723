package Spring02.StaticProxy;

/**
 * @Description: 实现取钱操作
 * @Author hujuncong
 * @Title: AccountServiceImpl
 * @Package Spring02.StaticProxy
 * @Date 2022/5/8 09:22
 */
public class AccountServiceImpl implements AccountService{
    @Override
    public void getMoney() {
        System.out.println("调用DAO层，操作数据库中的账户余额，完成业务");
    }
}
