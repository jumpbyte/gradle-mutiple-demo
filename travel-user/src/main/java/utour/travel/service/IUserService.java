package utour.travel.service;

import org.springframework.stereotype.Service;
import utour.travel.pojo.User;

import java.util.List;

/*
-----------------------
* 接口名称：IUserService
* 描述：
* 创建日期：2016/7/14
* 创建者：yuanjinan
* http://jumpbyte.com/
--------------------------
*/

public interface IUserService {
    int countAll();
    List<User> selectAll();
    int insert(User user);
    int delete(int userId);
    User findById(int userId);
}
