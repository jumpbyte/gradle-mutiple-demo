package utour.travle.test;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import utour.travel.pojo.User;
import utour.travel.service.IUserService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:springmvc-servlet.xml"})
public class UserServiceTest {

      @Autowired
      private IUserService userService;
      @Test
      public  void  TestGetAll(){
         List<User> userList= userService.selectAll();
          for (User user:userList) {
              System.out.println(user.toString());
          }
          Assert.assertNotNull(userList);
      }
}
