package test;

import entity.User;
import mapper.UserMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

        private ApplicationContext applicationContext;

        @Before
        public void setup() {
            applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        }
        @Test
        public void findUserById(){
            UserMapper userMapper = (UserMapper)applicationContext.getBean("userMapper");
            User user = userMapper.findUserById(1);
            System.out.println(user);
        }
}
