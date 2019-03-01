import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pojo.Person;
import service.PersonService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-context.xml")
public class MapperTest {
    @Autowired
    private PersonService service;

    @Test
    public void test01(){
        String id="abc";
        Person person=service.getPersonById(id);
        System.out.println(person);
    }
}
