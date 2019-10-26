package org.PersonnelManagementSystem.mapper;

import org.PersonnelManagementSystem.bean.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: PersonnelManagementSystem
 * @description: Menu Mapper
 * @author: Ronglin.A
 * @create: 2019-10-21 15:56
 */
@Mapper
@Repository
public interface MenuMapper {
    List<Menu> getAllMenu();

    List<Menu> getMenuByHrId(long id);
}
