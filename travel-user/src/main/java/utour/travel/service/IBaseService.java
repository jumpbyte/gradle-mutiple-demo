package utour.travel.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import java.util.List;

/*
-----------------------
* 接口名称：IBaseService
* 描述：
* 创建日期：2016/7/20
* 创建者：yuanjinan
* http://jumpbyte.com/
--------------------------
*/
@Service
public interface IBaseService<T> {

    T selectByKey(Object key);

    int save(T entity);

    int delete(Object key);

    int updateAll(T entity);

    int updateNotNull(T entity);

    List<T> selectWithCondition(Object queryObject);
}
