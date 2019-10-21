package org.PersonnelManagementSystem.bean;

import java.io.Serializable;

/**
 * @program: PersonnelManagementSystem
 * @description: Hr announce bean
 * @author: Ronglin.A
 * @create: 2019-10-20 15:00
 */
public class Announce implements Serializable {
    private String hrId;
    private String time;
    private String content;

    public Announce() {
    }

    public Announce(String hrId, String time, String content) {
        this.hrId = hrId;
        this.time = time;
        this.content = content;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
