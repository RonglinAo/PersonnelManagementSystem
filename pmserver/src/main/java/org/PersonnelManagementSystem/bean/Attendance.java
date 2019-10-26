package org.PersonnelManagementSystem.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: PersonnelManagementSystem
 * @description: Attendance bean
 * @author: Ronglin.A
 * @create: 2019-10-26 15:21
 */
public class Attendance implements Serializable {
    private long id;
    private Date date;
    private String remark;
    private AttendanceType attendanceType;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public AttendanceType getAttendanceType() {
        return attendanceType;
    }

    public void setAttendanceType(AttendanceType attendanceType) {
        this.attendanceType = attendanceType;
    }
}
