package helloMybatis;

import helloMybatis.Utils.Utils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class StudentDAOTest {
    @Test
    public void test() {
        SqlSession sqlSession= Utils.getSqlSession();

        StudentDAO studentDAO=sqlSession.getMapper(StudentDAO.class);
        List<Student> studentList=studentDAO.selectStudent();

        for (Student student:studentList
             ) {
            System.out.println(student);
        }

        sqlSession.close();
    }
}