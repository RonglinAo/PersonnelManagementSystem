package org.PersonnelManagementSystem.controller.personnel;

import org.PersonnelManagementSystem.bean.Attendance;
import org.PersonnelManagementSystem.bean.RespBean;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @program: PersonnelManagementSystem
 * @description: Attendance controller
 * @author: Ronglin.A
 * @create: 2019-10-26 15:12
 */
@RestController
@RequestMapping("/personnel/attendance/")
public class AttendanceController {


    @GetMapping("/dataconfig")
    public Map<String, Object> getAllDataConfig() {
        return null;
    }

    @GetMapping("/")
    public Map<String, Object> getAllAttendanceByPage(
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "10") Integer size,
            @RequestParam(defaultValue = "") String keywords,
            Long departmentId) {
        return null;
    }

    @GetMapping("/{empId}")
    public Map<String, Object> getEmpAttendanceByPage(
            @PathVariable long empId,
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "10") Integer size) {
        return null;
    }

    @PostMapping("/{empId}")
    public RespBean addEmpAttendance(@PathVariable long empId, Attendance attendance){
        return null;
    }

    @PutMapping("/{empId}")
    public RespBean updateEmpAttendance(@PathVariable long empId, Attendance attendance){
        return null;
    }

    @Deprecated
    @DeleteMapping("/{empId}/{attendId}")
    public RespBean deleteEmpAttendance(@PathVariable long empId,@PathVariable long attendId){
        return null;
    }
}
