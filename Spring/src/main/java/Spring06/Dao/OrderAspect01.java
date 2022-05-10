package Spring06.Dao;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author hujuncong
 * @Title: OrderAspect01
 * @Package Spring06.Dao
 * @Date 2022/5/10 17:53
 */
@Component // 定义成 Bean
@Aspect //定义为切面
public class OrderAspect01 {
    @Before("execution(* Spring06.Dao.OrderDao.add(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("前置增强……" + joinPoint);
    }

    @After("execution(* Spring06.Dao.OrderDao.get(..))")
    public void after(JoinPoint joinPoint) {
        System.out.println("最终增强……" + joinPoint);
    }

    /**
     * 将OrderDao类中的 get() 方法 定义为一个切点
     */
    @Pointcut(value = "execution(* Spring06.Dao.OrderDao.get(..))")
    public void pointCut1() {
    }

//    //使用切入点引用
//    @Around(value = "OrderAspect01.pointCut1()")
//    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        System.out.println("环绕增强……1");
//        proceedingJoinPoint.proceed();
//        System.out.println("环绕增强……2");
//    }

    //使用切入点表达式
    @AfterReturning(value = "execution(* Spring06.Dao.OrderDao.modify(..))", returning = "returnValue")
    public void afterReturning(Object returnValue) {
        System.out.println("后置返回增强……,方法返回值为：" + returnValue);
    }
}
