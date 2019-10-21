package org.PersonnelManagementSystem.bean;

import java.io.Serializable;

/**
 * @program: PersonnelManagementSystem
 * @description: Option log bean
 * @author: Ronglin.A
 * @create: 2019-10-20 14:51
 */
public class OptionLog implements Serializable {
    private String id;
    private String hrId;
    private String time;
    private String option;

    public OptionLog() {
    }

    public OptionLog(String id, String hrId, String time, String option) {
        this.id = id;
        this.hrId = hrId;
        this.time = time;
        this.option = option;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHrId() {
        return hrId;
    }

    public void setHrId(String hrId) {
        this.hrId = hrId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }
}
