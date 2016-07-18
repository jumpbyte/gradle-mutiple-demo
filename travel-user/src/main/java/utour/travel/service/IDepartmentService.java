package utour.travel.service;

import utour.travel.pojo.Department;

import java.util.List;


public interface IDepartmentService  extends IBaseService<Department>{

     List<Department>  pageListByCondition(Department department,int page ,int rows);
}
