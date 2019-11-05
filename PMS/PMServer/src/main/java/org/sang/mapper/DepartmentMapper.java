package org.sang.mapper;

import org.apache.ibatis.annotations.Param;
import org.sang.bean.Department;

import java.util.List;


public interface DepartmentMapper {
    void addDep(@Param("dep") Department department);

    void deleteDep(@Param("dep") Department department);

    List<Department> getDepByPid(Long pid);

    List<Department> getAllDeps();
}
