package org.PersonnelManagementSystem.bean;

import javax.naming.directory.SearchControls;
import java.io.Serializable;

/**
 * @program: PersonnelManagementSystem
 * @description: Attendance type bean
 * @author: Ronglin.A
 * @create: 2019-10-26 15:29
 */
public class AttendanceType implements Serializable {
    private long id;
    private String name;

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRemark() {
        return remark;
    }

    private String remark;
}
