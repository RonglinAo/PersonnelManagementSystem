package org.PersonnelManagementSystem.bean;

import java.io.Serializable;

/**
 * @program: PersonnelManagementSystem
 * @description: Employee appraise bean
 * @author: Ronglin.A
 * @create: 2019-10-19 11:13
 */
public class Appraise implements Serializable {
    private String employeeId;
    private String time;
    private String result;
    private String remark;

    public Appraise() {

    }

    public Appraise(String employeeId, String time, String result, String remark) {
        this.employeeId = employeeId;
        this.time = time;
        this.result = result;
        this.remark = remark;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
