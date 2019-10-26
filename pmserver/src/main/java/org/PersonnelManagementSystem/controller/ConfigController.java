package org.PersonnelManagementSystem.controller;

import org.PersonnelManagementSystem.bean.Menu;
import org.PersonnelManagementSystem.mapper.MenuMapper;
import org.PersonnelManagementSystem.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: PersonnelManagementSystem
 * @description: 系统信息Controller
 * @author: Ronglin.A
 * @create: 2019-10-27 16:51
 */
@RestController
@RequestMapping("/config")
public class ConfigController {
    @Autowired
    MenuService menuService;

    @GetMapping("/sysmenu")
    public List<Menu> GetSysMenu(){
        return menuService.getMenuByHrId();
    }
}
