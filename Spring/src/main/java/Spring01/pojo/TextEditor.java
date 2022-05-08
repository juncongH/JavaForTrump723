package Spring01.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

/**
 * @Description:
 * @Author hujuncong
 * @Title: TextEditor
 * @Package Spring01.pojo
 * @Date 2022/5/8 23:27
 */
public class TextEditor {
    @Autowired
    private SpellChecker spellChecker;
    private String name;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public String getName() {
        return name;
    }

    @Autowired
    public void setName(String name) {
        this.name = name;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
