package Spring06.Dao;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Description:
 * @Author hujuncong
 * @Title: OrderAspect
 * @Package Spring06
 * @Date 2022/5/10 17:00
 */
public class OrderAspect {
    public void before() {
        System.out.println("before():前置增强……");
    }
    public void after() {
        System.out.println("after():最终增强……");
    }
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around():环绕增强---前……");
        proceedingJoinPoint.proceed();
        System.out.println("around():环绕增强---后……");
    }
    public void afterThrow(Throwable exception) {
        System.out.println("afterThrow():异常增强…… 异常信息为：" + exception.getMessage());
    }
    public void afterReturning(Object returnValue) {
        System.out.println("afterReturning():后置返回增强…… 方法返回值为：" + returnValue);
    }
}
