package com.example.demo;

import com.lafeier.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	Person p ;


	@Test
	public void contextLoads() {
        System.out.println(p);
    }

}
