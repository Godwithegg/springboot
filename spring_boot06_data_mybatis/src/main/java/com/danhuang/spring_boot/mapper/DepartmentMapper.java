package com.danhuang.spring_boot.mapper;

import com.danhuang.spring_boot.bean.Department;
import org.apache.ibatis.annotations.*;

//指定这是一个操作数据库的mapper
//@Mapper    //如果不加mapper需要在启动类中制定mapperscan
public interface DepartmentMapper {
    @Select("select * from department where id = #{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id = #{id}")
    public int delteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(department_name) values(#{department_name})")
    public int insertDept(Department department);

    @Update("update department set department_name = #{department_name} where id = #{id}")
    public int updateDept(Department department);
}
