package utour.travel.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import utour.travel.pojo.*;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/*
-----------------------
* 接口名称：IUserDao
* 描述：
* 创建日期：2016/6/21
* 创建者：yuanjinan
* http://jumpbyte.com/
--------------------------
*/

@Repository("userMapper")
public interface IUserMapper {

    int countAll();
    List<User> selectAll();
    int insert(User user);
    int delete(int userId);
    User findById(int userId);
}
