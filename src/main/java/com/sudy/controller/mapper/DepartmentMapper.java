package com.sudy.controller.mapper;


import org.apache.ibatis.annotations.*;

import com.sudy.controller.bean.Department;


//指定这是一个操作数据库的mapper
 @Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentname) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentname=#{departmentName} where id=#{id}")
    public int updateDept(Department department);
}
