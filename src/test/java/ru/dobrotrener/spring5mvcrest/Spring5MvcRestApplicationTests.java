package ru.dobrotrener.spring5mvcrest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {Spring5MvcRestApplication.class})
public class Spring5MvcRestApplicationTests {

    @Test
    public void contextLoads() {
    }

}
