package utour.travle.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import utour.travel.pojo.Department;
import utour.travel.service.IDepartmentService;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:springmvc-servlet.xml"})
public class DepartmentServiceTest {

    @Autowired
    private IDepartmentService departmentService;


    @Test
    public  void testSave(){
        Department department=new Department();
        department.setName("分销平台技术部");
        Assert.assertEquals(1,departmentService.save(department));
    }

    @Test
    public  void  testUpdate(){

        Department department=new Department();
        department.setName("互联网技术部");
        department.setId(1);
        Assert.assertEquals(1,departmentService.updateNotNull(department));
    }

    @Test
    public  void testSelectByKey(){

        Department department= departmentService.selectByKey(1);
        System.out.println(department);
        Assert.assertNotNull(department);
    }

    @Test
    public void testPage() {
        Department dept = new Department();
        dept.setName("部");

        List<Department> departmentList = departmentService.pageListByCondition(dept, 1, 5);

        Assert.assertNotNull(departmentList);
        for (Department item:departmentList ) {
            System.out.println(item);
            System.out.println();
        }
    }

    @Test
    public  void  testDelete(){
        Department department=new Department();
        Assert.assertEquals(1,departmentService.delete(5));
    }
}
