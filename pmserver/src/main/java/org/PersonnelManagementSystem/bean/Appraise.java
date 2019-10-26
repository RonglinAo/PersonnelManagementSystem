package org.PersonnelManagementSystem.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: PersonnelManagementSystem
 * @description: Appraise bean
 * @author: Ronglin.A
 * @create: 2019-10-26 15:29
 */
public class Appraise implements Serializable {
    private long id;
    private Date date;
    private String remark;
    private AppraiseType appraiseType;

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

    public AppraiseType getAppraiseType() {
        return appraiseType;
    }

    public void setAppraiseType(AppraiseType appraiseType) {
        this.appraiseType = appraiseType;
    }
}
