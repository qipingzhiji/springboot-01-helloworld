package com.test;

import com.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by zhang_htao on 2019/5/26.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class WebApplicationStaterTest {
    @Autowired
    private Person person;

    @Test
    public void contextLoads() {
        System.out.println(person.toString());
    }

}
