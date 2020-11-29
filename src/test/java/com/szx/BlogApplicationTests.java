package com.szx;

import com.szx.pojo.Person;
import com.szx.service.PersonService;
import com.szx.service.impl.PersonServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.util.List;

@SpringBootTest
class BlogApplicationTests {

    @Autowired
    DataSource dataSource;

    @Autowired
    PersonServiceImpl personService;

    @Test
    public void personTest() {
        System.out.println(dataSource.getClass());
        List<Person> p = personService.getAllPerson();
        for (Person person : p) {
            System.out.println(person);
        }
    }
}
