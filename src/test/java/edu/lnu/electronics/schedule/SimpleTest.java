package edu.lnu.electronics.schedule;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleTest {

    @Test
    public void simpleTest(){
        Assert.assertEquals(9, 3+6);
    }

}
