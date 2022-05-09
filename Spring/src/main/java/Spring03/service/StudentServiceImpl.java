package Spring03.service;

import Spring03.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author hujuncong
 * @Title: StudentServiceImpl
 * @Package Spring03.service
 * @Date 2022/5/9 23:44
 */
@Service(value = "studentServiceImpl")
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentDao studentDao;

    public StudentDao getStudentDao() {
        return studentDao;
    }

    @Override
    public String run() {
        return studentDao.getInfo();
    }
}
