package String03;

import Spring03.Student;
import Spring03.service.StudentServiceImpl;
import Spring04.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    public static void main(String[] args) {
//        ApplicationContext context=new ClassPathXmlApplicationContext("bean03.xml");
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        StudentServiceImpl studentServiceImpl= (StudentServiceImpl) context.getBean("studentServiceImpl");
        System.out.println(studentServiceImpl.run());
    }
}