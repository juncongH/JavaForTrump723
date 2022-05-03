package Mybatis_superior.Utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Description:
 * @Author hujuncong
 * @Title: Utils
 * @Package Mybatis_superior.Utils
 * @Date 2022/5/3 21:13
 */
public class Utils {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        String resource="mybatis.config3.xml";
        InputStream is=null;

        try {
            is= Resources.getResourceAsStream(resource);
            sqlSessionFactory= new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
