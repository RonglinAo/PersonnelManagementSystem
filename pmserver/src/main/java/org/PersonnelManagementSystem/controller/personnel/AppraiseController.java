package org.PersonnelManagementSystem.controller.personnel;

import org.PersonnelManagementSystem.bean.Appraise;
import org.PersonnelManagementSystem.bean.RespBean;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @program: PersonnelManagementSystem
 * @description: Appraise controller
 * @author: Ronglin.A
 * @create: 2019-10-26 15:54
 */
@RestController
@RequestMapping("/personnel/appraise/")
public class AppraiseController {


    @GetMapping("/dataconfig")
    public Map<String, Object> getAllDataConfig() {
        return null;
    }

    @GetMapping("/")
    public Map<String, Object> getAllAppraiseByPage(
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "10") Integer size,
            @RequestParam(defaultValue = "") String keywords) {
        return null;
    }

    @GetMapping("/{empId}")
    public Map<String, Object> getEmpAppraiseByPage(
            @PathVariable long empId,
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "10") Integer size) {
        return null;
    }

    @PostMapping("/{empId}")
    public RespBean addEmpAppraise(@PathVariable long empId, Appraise appraise) {
        return null;
    }

    @PutMapping("/{empId}")
    public RespBean updateEmpAppraise(@PathVariable long empId,Appraise appraise) {
        return null;
    }

    @DeleteMapping("/{empId}/{appraiseId}")
    public RespBean deleteEmpAppraise(@PathVariable long empId, @PathVariable long appraiseId) {
        return null;
    }
}
