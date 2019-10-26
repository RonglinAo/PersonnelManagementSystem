package org.PersonnelManagementSystem.controller.personnel;

import org.PersonnelManagementSystem.bean.Employee;
import org.PersonnelManagementSystem.bean.RespBean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * @program: PersonnelManagementSystem
 * @description: Employee info Controller
 * @author: Ronglin.A
 * @create: 2019-10-26 14:49
 */
@RestController
@RequestMapping("/personnel/info/")
public class InfoController {


    @GetMapping("/dataconfig")
    public Map<String, Object> getAllDataConfig() {
        return null;
    }

    @GetMapping("/getnewid")
    public String newWorkId() {
        return null;
    }

    @GetMapping("/")
    public Map<String, Object> getEmployeeByPage(
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "10") Integer size,
            @RequestParam(defaultValue = "") String keywords,
            Long politicId, Long nationId, Long posId,
            Long jobLevelId, String engageForm,
            Long departmentId, String beginDateScope) {
        return null;
    }

    @PostMapping("/")
    public RespBean addEmp(Employee employee) {
        return null;
    }

    @PutMapping("/")
    public RespBean updateEmp(Employee employee) {
        return null;
    }

    @DeleteMapping("/{empId}")
    public RespBean deleteEmpById(@PathVariable String empId) {
        return null;
    }

    @GetMapping("/exportEmp")
    public ResponseEntity<byte[]> exportEmp() {
        return null;
    }

    @PostMapping("/importEmp")
    public RespBean importEmp(MultipartFile file) {
        return null;
    }
}
