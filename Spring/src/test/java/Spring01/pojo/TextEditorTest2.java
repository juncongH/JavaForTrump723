package Spring01.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class TextEditorTest2 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Beans3.xml");
        TextEditor textEditor= (TextEditor) context.getBean("textEditor");
        textEditor.spellCheck();
    }
}