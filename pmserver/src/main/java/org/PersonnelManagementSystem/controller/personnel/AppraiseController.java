package org.PersonnelManagementSystem.controller.personnel;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import javafx.geometry.Pos;
import org.PersonnelManagementSystem.bean.Appraise;
import org.PersonnelManagementSystem.bean.RespBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: PersonnelManagementSystem
 * @description: 员工评估控制器
 * @author: Ronglin.A
 * @create: 2019-10-19 09:45
 */
@RestController
@RequestMapping("/personnel/appraise")
public class AppraiseController {
    @ApiOperation(value = "获得所有员工的评估信息单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", dataType = "Integer", value = "当前页面数，默认为1", required = true),
            @ApiImplicitParam(name = "size", dataType = "Integer", value = "当前页面容纳的项目条数", required = true),
            @ApiImplicitParam(name = "keyword", dataType = "String", value = "查找的关键词，默认为空<code>\"\"<code>", required = true)
    })
    @GetMapping("/")
    public Map<String, Object> getEmployeeAppraiseByPage(
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "10") Integer size,
            @RequestParam(defaultValue = "") String keyword
    ) {
        Map<String, Object> map = new HashMap<>();
        /**
         * 处理map
         */
        return map;
    }


    @Deprecated
    @ApiOperation(value = "添加员工评估详情页面")
    @PostMapping("/")
    public RespBean addEmployeeAppraise(){
        /**
         * 处理
         * return RespBean.ok("添加成功!");
         */
        return RespBean.error("添加失败!");
    }

    @ApiOperation(value = "显示员工评估详情页面")
    @ApiImplicitParam(name = "id",value = "路径变量，员工的id")
    @GetMapping("/{id}")
    public Object getEmployeeAppraise(@PathVariable String id){
        /**
         * 处理
         */
        return null;
    }

    @ApiOperation("更改员工评估")
    @ApiImplicitParam(name = "id",value = "路径变量，员工的id")
    @PutMapping("/{id}")
    public RespBean updateEmployeeAppraise(@PathVariable String id, Appraise appraise){
        /**
         * 处理
         * return RespBean.ok("修改成功!");
         */
        return RespBean.error("修改失败!");
    }

    @Deprecated
    @ApiOperation("删除员工评估")
    @ApiImplicitParam(name = "id",value = "员工的id")
    public RespBean deleteEmployeeAppraise(@PathVariable String id){
        /**
         * 处理
         * return RespBean.ok("删除成功!");
         */
        return RespBean.error("删除失败!");
    }
}
