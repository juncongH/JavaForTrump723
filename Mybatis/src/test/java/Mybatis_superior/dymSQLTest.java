package Mybatis_superior;

import Mybatis_superior.Utils.Utils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class dymSQLTest {

    @Test
    public void selectIF() {
        SqlSession sqlSession= Utils.getSqlSession();
        dymSQL dym=sqlSession.getMapper(dymSQL.class);
        List<College> collegeList= dym.selectIf("信息学部");
        System.out.println(collegeList);

        sqlSession.close();
    }

    @Test
    public void selectChoose() {
        SqlSession sqlSession= Utils.getSqlSession();
        dymSQL dym=sqlSession.getMapper(dymSQL.class);
        List<College> collegeList= dym.selectChoose("测绘");
        System.out.println(collegeList);

        sqlSession.close();
    }
}