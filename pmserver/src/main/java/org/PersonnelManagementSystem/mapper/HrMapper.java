package org.PersonnelManagementSystem.mapper;

import org.PersonnelManagementSystem.bean.Hr;
import org.PersonnelManagementSystem.bean.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: PersonnelManagementSystem
 * @description: Hr Mapper
 * @author: Ronglin.A
 * @create: 2019-10-21 14:06
 */
@Mapper
@Repository
public interface HrMapper {
    Hr loadHrByHrEmail(String email);

    List<Role> getRoleByHrId(String id);
}
