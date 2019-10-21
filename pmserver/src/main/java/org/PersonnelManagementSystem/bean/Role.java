package org.PersonnelManagementSystem.bean;

import java.io.Serializable;

/**
 * @program: PersonnelManagementSystem
 * @description: Hr role
 * @author: Ronglin.A
 * @create: 2019-10-20 16:04
 */
public class Role implements Serializable {
    private Long id;
    private String name;
    private String nameZh;

    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}