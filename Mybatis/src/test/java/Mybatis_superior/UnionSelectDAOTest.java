package Mybatis_superior;

import Mybatis_superior.Utils.Utils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UnionSelectDAOTest {

    @Test
    public void selectStudentByLocated() {
        String located="信息学部";
        SqlSession sqlSession= Utils.getSqlSession();
        UnionSelectDAO unionSelectDAO=sqlSession.getMapper(UnionSelectDAO.class);
        List<College> collegeList= unionSelectDAO.selectStudentByLocated(located);
        collegeList.forEach(college -> {
            System.out.println(college.getLocated()+college.getStudents());
        });

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void selectAllInfo() {
        SqlSession sqlSession=Utils.getSqlSession();
        UnionSelectDAO unionSelectDAO=sqlSession.getMapper(UnionSelectDAO.class);
        List<Student> studentList=unionSelectDAO.selectAllInfo();
        studentList.forEach(System.out::println);

        sqlSession.commit();
        sqlSession.close();
    }
}