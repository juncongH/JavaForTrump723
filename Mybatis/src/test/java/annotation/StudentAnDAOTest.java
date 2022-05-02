package annotation;

import annotation.Utils.Utils;
import helloMybatis.StudentDAO;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class StudentAnDAOTest {

    @Test
    public void insert() {
        int id=10;
        int sid=2020987;
        String name="米桑";
        String college="测绘";
        LocalDate date=LocalDate.of(2019, 12, 31);

        SqlSession sqlSession= Utils.getSqlSession();
        StudentAnDAO studentAnDAO = sqlSession.getMapper(StudentAnDAO.class);
        studentAnDAO.insert(id,sid,name,college,date);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateNameBySid() {
        int sid=2020987;
        String name="杨柳";

        SqlSession sqlSession=Utils.getSqlSession();
        StudentAnDAO studentAnDAO=sqlSession.getMapper(StudentAnDAO.class);
        studentAnDAO.updateNameBySid(sid,name);

        sqlSession.commit();;
        sqlSession.close();
    }

    @Test
    public void deleteBySid() {
        int sid=2014123;

        SqlSession sqlSession=Utils.getSqlSession();
        StudentAnDAO studentAnDAO=sqlSession.getMapper(StudentAnDAO.class);
        studentAnDAO.deleteBySid(sid);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void selectByCollege() {
        String college="测绘";

        SqlSession sqlSession=Utils.getSqlSession();
        StudentAnDAO studentAnDAO=sqlSession.getMapper(StudentAnDAO.class);
        List<Student> res=studentAnDAO.selectByCollege(college);

        res.forEach(System.out::println);

        sqlSession.commit();
        sqlSession.close();
    }
}