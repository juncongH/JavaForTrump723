package Solution03;

import Solution02.Student;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;

public class StudentDAOImplTest {
    @Test
    public void insertTest() {
        try {
            StudentDAOImpl test=new StudentDAOImpl();
            Student student=new Student();
            student.setSid(2011153);
            student.setName("大右");
            student.setCollege("测绘");

            student.setDate(LocalDate.of(2019, 12, 31));
            test.insert((Connection) test.getClass().getMethod("getConnection").invoke(test),student);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void deleteTest() {
        try {
            StudentDAOImpl test=new StudentDAOImpl();
            int sid=2018312;
            test.deleteBySid((Connection) test.getClass().getMethod("getConnection").invoke(test),sid);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void selectByCollegeTest() {
        try {
            StudentDAOImpl test=new StudentDAOImpl();
            String college="测绘";
            List<Student> students = test.selectByCollege((Connection) test.getClass().getMethod("getConnection").invoke(test),college);
            students.forEach(student -> System.out.println(student.toString()));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void CountTest() {
        try{
            StudentDAOImpl test=new StudentDAOImpl();
            String college="测绘";
            int Count = test.getCountByCollege((Connection) test.getClass().getMethod("getConnection").invoke(test),college);
            System.out.println(college+Count);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}