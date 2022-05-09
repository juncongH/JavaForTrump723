package Spring01;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * The type Life cycle bean.
 *
 * @Description: Bean生命周期
 * @Author hujuncong
 * @Title: LifeCycleBean
 * @Package Spring01
 * @Date 2022 /5/9 21:48
 */
public class LifeCycleBean implements InitializingBean, DisposableBean {
    private String attr;

    public LifeCycleBean() {
        System.out.println("Bean构造");
    }


    public void setAttr(String attr) {
        this.attr = attr;
        System.out.println("Bean调用set方法设置属性");
    }

    /***
     * 指定初始化回调方法，这个方法会在 Spring Bean 被初始化后被调用，执行一些自定义的回调操作
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean初始化方法");
    }

    /***
     * 指定销毁回调方法，这个方法会在 Spring Bean 被销毁前被调用，执行一些自定义的回调操作
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("Bean即将销毁");
    }
}
