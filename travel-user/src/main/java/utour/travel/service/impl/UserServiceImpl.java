package utour.travel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import utour.travel.dao.IUserMapper;
import utour.travel.pojo.User;
import utour.travel.service.IUserService;
import java.util.List;

/*
-----------------------
* 类名称：IUserServiceImpl
* 描述：
* 创建日期：2016/7/14
* 创建者：yuanjinan
* http://jumpbyte.com/
--------------------------
*/

@Scope("prototype")
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserMapper userMapper;

    @Override
    public int countAll() {
        return 0;
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public int insert(User user) {
        return 0;
    }

    @Override
    public int delete(int userId) {
        return 0;
    }

    @Override
    public User findById(int userId) {
        return null;
    }
}
