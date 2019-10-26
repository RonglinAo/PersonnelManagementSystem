package org.PersonnelManagementSystem.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @program: PersonnelManagementSystem
 * @description: Salary bean
 * @author: Ronglin.A
 * @create: 2019-10-26 13:01
 */
public class Salary implements Serializable {
    private long id;
    private Date date;

    private BasicSalary basicSalary;

    private List<AdjustSalary> adjustSalaries;

    private List<Bonus> bonuses;

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

    public BasicSalary getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(BasicSalary basicSalary) {
        this.basicSalary = basicSalary;
    }

    public List<AdjustSalary> getAdjustSalaries() {
        return adjustSalaries;
    }

    public void setAdjustSalaries(List<AdjustSalary> adjustSalaries) {
        this.adjustSalaries = adjustSalaries;
    }

    public List<Bonus> getBonuses() {
        return bonuses;
    }

    public void setBonuses(List<Bonus> bonuses) {
        this.bonuses = bonuses;
    }
}
