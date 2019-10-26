package org.PersonnelManagementSystem.controller.salary;

import org.PersonnelManagementSystem.bean.*;
import org.apache.ibatis.annotations.Delete;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * @program: PersonnelManagementSystem
 * @description: Salary controller
 * @author: Ronglin.A
 * @create: 2019-10-26 16:19
 */
@RestController
@RequestMapping("/salary")
public class SalaryController {

    @GetMapping("/dataconfig")
    public Map<String, Object> getAllDataConfig() {
        return null;
    }

    @GetMapping("/bookofset")
    public Map<String, Object> getAllBasicSalaryByPage(
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "10") Integer size) {
        return null;
    }

    @PostMapping("/bookofset")
    public RespBean addBasicSalary(BasicSalary basicSalary) {
        return null;
    }

    @PutMapping("/bookofset")
    public RespBean updateBasicSalary(BasicSalary basicSalary) {
        return null;
    }

    @DeleteMapping("/bookofset/{bsId}")
    public RespBean addBasicSalary(@PathVariable long bsId) {
        return null;
    }



    @GetMapping("emp/{empId}")
    public Map<String, Object> getEmpSalaryByPage(
            @PathVariable long empId,
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "10") Integer size,
            @RequestParam(defaultValue = "") String keywords) {
        return null;
    }

    @PostMapping("emp/{empId}/adjust")
    public RespBean addEmpAdjustSalary(@PathVariable long empId, AdjustSalary adjustSalary) {
        return null;
    }

    @PostMapping("emp/{empId}/bonus")
    public RespBean addEmpBonus(@PathVariable long empId, Bonus bonus) {
        return null;
    }

    @PutMapping("emp/{empId}/adjust")
    public RespBean updateEmpAdjustSalary(@PathVariable long empId,AdjustSalary adjustSalary) {
        return null;
    }

    @PutMapping("emp/{empId}/bonus")
    public RespBean updateEmpBonus(@PathVariable long empId,Bonus bonus) {
        return null;
    }

    @DeleteMapping("emp/{empId}/adjust/{adjustSalaryId}")
    public RespBean deleteEmpAdjustSalary(@PathVariable long empId, @PathVariable long adjustSalaryId) {
        return null;
    }

    @DeleteMapping("emp/{empId}/bonus/{BonusId}")
    public RespBean deleteEmpBonus(@PathVariable long empId, @PathVariable long BonusId) {
        return null;
    }
}
