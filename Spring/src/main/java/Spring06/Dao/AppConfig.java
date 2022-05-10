package Spring06.Dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Description:
 * @Author hujuncong
 * @Title: AppConfig
 * @Package Spring06.Dao
 * @Date 2022/5/10 17:56
 */
@Configuration
@ComponentScan(basePackages = "Spring06")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfig {
}
