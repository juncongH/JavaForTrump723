package String03;

import Spring03.Student;
import Spring03.service.StudentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean03.xml");
        StudentServiceImpl studentServiceImpl= (StudentServiceImpl) context.getBean("studentServiceImpl");
        System.out.println(studentServiceImpl.run());
    }
}