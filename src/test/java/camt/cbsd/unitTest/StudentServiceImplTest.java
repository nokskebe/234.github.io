package camt.cbsd.unitTest;

import camt.cbsd.dao.StudentDao;
import camt.cbsd.entity.Student;
import camt.cbsd.services.StudentServiceImpl;
import org.hamcrest.core.Is;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by User on 14/5/2560.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceImplTest {
    StudentDao studentDao;
    StudentServiceImpl studentService;
    @Autowired
    public void setStudentDao(StudentDao studentDao){
        this.studentDao=studentDao;
    }
    @Test
    public void queryStudentTest(){
        studentService=new StudentServiceImpl();
        studentService.setStudentDao(studentDao);
        assertThat(studentService.queryStudent("").get(1).getUser().getUsername(),is("user"));
        //assertThat(studentService.queryStudent("").get(1).getUser().getId(),is("1"));
        //assertThat(studentService.queryStudent("").get(1).getUser().getFirstname(),is("Mitsuha"));
        assertThat(studentService.queryStudent("").get(1).getUser().getLastname(),is("Miyamizu"));


    }
}
