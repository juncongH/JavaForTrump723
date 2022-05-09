package Spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class Test01 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean01.xml");
        Student student= (Student) context.getBean("student");
        Student student1= (Student) context.getBean("student");
        System.out.println(student);
        System.out.println(student1);
    }
}