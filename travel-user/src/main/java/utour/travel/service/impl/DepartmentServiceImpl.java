package utour.travel.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.StringUtil;
import utour.travel.dao.DepartmentMapper;
import utour.travel.pojo.Department;
import utour.travel.service.BaseService;
import utour.travel.service.IDepartmentService;

import java.util.List;


@Service("departmentService")
public class DepartmentServiceImpl extends BaseService<Department> implements  IDepartmentService {


    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> pageListByCondition(Department department, int page, int rows) {
        Example example = new Example(Department.class);
        Example.Criteria criteria = example.createCriteria();
        if (StringUtil.isNotEmpty(department.getName())) {
            criteria.andLike("name", "%" + department.getName() + "%");
        }
        //分页查询
        PageHelper.startPage(0,5);
        return selectWithCondition(example);
    }
}
