package org.PersonnelManagementSystem.controller.personnel;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.PersonnelManagementSystem.bean.Employee;
import org.PersonnelManagementSystem.bean.RespBean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: PersonnelManagementSystem
 * @description: Personnel information controller
 * @author: Ronglin.A
 * @create: 2019-10-18 14:01
 */
@RestController
@RequestMapping("/personnel/info")
public class InfoController {
    @ApiOperation(value = "获取员工信息中的元素")
    @GetMapping("/data-config")
    public Map<String, Object> getInfoConfig() {
        Map<String, Object> map = new HashMap<>();
        /**
         * 处理map
         */
        return map;
    }

    @ApiOperation(value = "获得所有员工信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", dataType = "Integer", value = "当前页面数，默认为1", required = true),
            @ApiImplicitParam(name = "size", dataType = "Integer", value = "当前页面容纳的项目条数", required = true),
            @ApiImplicitParam(name = "keyword", dataType = "String", value = "查找的关键词，默认为空<code>\"\"<code>", required = true),
            @ApiImplicitParam(name = "politicId", dataType = "Long", value = "政治面貌Id", required = false),
            @ApiImplicitParam(name = "nationId", dataType = "Long", value = "国籍Id", required = false),
            @ApiImplicitParam(name = "posId", dataType = "Long", value = "职位Id", required = false),
            @ApiImplicitParam(name = "jobLevelId", dataType = "Long", value = "职称Id", required = false),
            @ApiImplicitParam(name = "engageForm", dataType = "String", value = "婚姻状态", required = false),
            @ApiImplicitParam(name = "departmentId", dataType = "Long", value = "部门Id", required = false),
            @ApiImplicitParam(name = "beginDateScope", dataType = "String", value = "入职时间范围，格式为<code>(Date,Date)<code>", required = false),
    })
    @GetMapping("/")
    public Map<String, Object> getEmployeeByPage(
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "10") Integer size,
            @RequestParam(defaultValue = "") String keyword,
            Long politicId, Long nationId, Long posId,
            Long jobLevelId, String engageForm,
            Long departmentId, String beginDateScope) {
        Map<String, Object> map = new HashMap<>();
        /**
         * 处理map
         */
        return map;
    }

    @ApiOperation(value = "添加一个员工信息")
    @ApiImplicitParam(name = "employee", value = "员工实例", required = true)
    @PostMapping("/")
    public RespBean addEmployee(Employee employee) {
        /**
         * 处理
         * return RespBean.ok("添加成功!");
         */
        return RespBean.error("添加失败!");
    }

    @ApiOperation(value = "修改一个员工信息")
    @ApiImplicitParam(name = "employee", value = "员工实例", required = true)
    @PutMapping("/")
    public RespBean updateEmployee(Employee employee) {
        /**
         * 处理
         * return RespBean.ok("修改成功!");
         */
        return RespBean.error("修改失败!");
    }

    @ApiOperation(value = "删除员工信息")
    @ApiImplicitParam(name = "id", value = "要删除的员工的id", required = true)
    @DeleteMapping("/")
    public RespBean deleteEmployee(String ID) {
        /**
         * 处理
         * return RespBean.ok("删除成功!");
         */
        return RespBean.error("删除失败!");
    }

    @ApiOperation(value = "下载员工信息为*.xls")
    @ApiImplicitParam(name = "ids", value = "要删除的员工的id集合，格式为<code>\"id,id,id,id...\"<code>", required = true)
    @GetMapping("/export")
    public ResponseEntity<byte[]> exportEmp(String... ids) {
        /**
         * 处理
         */
        return null;
    }

    @ApiOperation(value = "上传员工信息为*.xls")
    @PostMapping("/import")
    public RespBean importEmp(MultipartFile file) {
        /**
         * 处理
         * return RespBean.ok("导入成功!");
         */
        return RespBean.error("导入失败!");
    }
}
