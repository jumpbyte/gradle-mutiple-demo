package utour.travel.service;

import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;

/*
-----------------------
* 类名称：BaseService
* 描述：
* 创建日期：2016/7/20
* 创建者：yuanjinan
* http://jumpbyte.com/
--------------------------
*/
public abstract class BaseService<T> implements IBaseService<T> {

    @Autowired
    protected Mapper<T> mapper;

    public  Mapper<T> getMapper(){
        return  mapper;
    }

    @Override
    public T selectByKey(Object key) {
        return mapper.selectByPrimaryKey(key);
    }

    @Override
    public int save(T entity) {

        return mapper.insert(entity);
    }

    @Override
    public int delete(Object key) {

        return mapper.deleteByPrimaryKey(key);
    }

    @Override
    public int updateAll(T entity) {
        return mapper.updateByPrimaryKey(entity);
    }

    @Override
    public int updateNotNull(T entity) {
       return mapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public List<T> selectWithCondition(Object queryObject) {

        return mapper.selectByExample(queryObject);
    }
}
