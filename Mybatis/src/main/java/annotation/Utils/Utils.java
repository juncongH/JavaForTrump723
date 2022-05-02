package annotation.Utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Mybatis注解实现的流程：XML配置文件，连接数据库————编写mybatis工具类Utils————编写代码（实体类，接口）—— 修改配置文件，绑定接口
 * 1.resource/mybatis.config.xml,db.properties
 * 2.Utils
 * 3.Student.java
 * 4.StudentDAO
 * 5.mybatis.config.xml中的mapper绑定接口
 *
 * @Description: 通用操作
 * @Author hujuncong
 * @Title: utils
 * @Package helloMybatis.Utils
 * @Date 2022/5/1 14:04
 */
public class Utils {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        String resource = "mybatis.config2.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
