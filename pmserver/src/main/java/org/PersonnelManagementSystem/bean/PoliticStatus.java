package org.PersonnelManagementSystem.bean;

import java.io.Serializable;

/**
 * @program: PersonnelManagementSystem
 * @description: PoliticStatus
 * @author: Ronglin.A
 * @create: 2019-10-26 13:59
 */
public class PoliticStatus implements Serializable {
    long id;
    String Name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
