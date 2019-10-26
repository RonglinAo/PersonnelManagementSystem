package org.PersonnelManagementSystem.bean;

import java.io.Serializable;

/**
 * @program: PersonnelManagementSystem
 * @description: Job bean
 * @author: Ronglin.A
 * @create: 2019-10-26 12:59
 */
public class Job implements Serializable {
    private long id;

    private JobTitle jobTitle;

    private Department department;

    public void setId(long id) {
        this.id = id;
    }

    public void setJobTitle(JobTitle jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public long getId() {
        return id;
    }

    public JobTitle getJobTitle() {
        return jobTitle;
    }

    public Department getDepartment() {
        return department;
    }
}
