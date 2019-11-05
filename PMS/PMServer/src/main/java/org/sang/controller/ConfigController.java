package org.sang.controller;

import io.swagger.annotations.ApiOperation;
import org.sang.bean.Hr;
import org.sang.bean.Menu;
import org.sang.common.HrUtils;
import org.sang.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/config")
public class ConfigController {
    @Autowired
    MenuService menuService;
    //获得该用户可以操作的菜单
    @ApiOperation(value="获得该用户可以操作的菜单")
    @RequestMapping("/sysmenu")
    public List<Menu> sysmenu() {
        System.out.println("输出菜单");
        System.out.println(menuService.getMenusByHrId());
        return menuService.getMenusByHrId();
    }
    @ApiOperation(value="获得当前用户")
    @RequestMapping("/hr")
    public Hr currentUser() {
        return HrUtils.getCurrentHr();
    }
}
