package camt.cbsd;

//import camt.cbsd.dao.CourseDao;
//import camt.cbsd.services.CourseServiceImpl;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;

import camt.cbsd.dao.CourseDao;
import camt.cbsd.dao.StudentDao;
import camt.cbsd.entity.Student;
import camt.cbsd.repository.CourseRepository;
import camt.cbsd.services.CourseServiceImpl;
import camt.cbsd.services.StudentServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;




/**
 * Created by goes__000 on 5/14/2017.
 */
public class Test234 {

    @Autowired
    public void setCourseDao(CourseDao courseDao) {
        this.courseDao = courseDao;
    }
    CourseDao courseDao;
    CourseServiceImpl courseService;

    @Test
    public void testGetCourseCountMethod() {
        courseService = new CourseServiceImpl();
        courseService.setCourseDao(courseDao);
        assertThat(courseService.getCourseCount(),is(3));}




}
