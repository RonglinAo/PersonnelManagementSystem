package org.PersonnelManagementSystem.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @program: PersonnelManagementSystem
 * @description: Employee Bean
 * @author: Ronglin.A
 * @create: 2019-10-26 12:50
 */
public class Employee implements Serializable {
    private long id;
    private String workId;
    private String name;
    private String gender;
    private Date birthday;
    private String idNumber;
    private String phone;
    private String email;
    private String address;
    private Date entryDate;
    private Date contractExpireDate;
    private Nation nation;
    private PoliticStatus politicStatus;
    private Education education;
    private WorkingStatus workingStatus;
    //工作
    private List<Job> jobs;
    //薪水
    private List<Salary> Salaries;
    //考勤
    private List<Attendance> attendances;
    //评价
    private List<Appraise> appraises;

    public List<Attendance> getAttendances() {
        return attendances;
    }

    public void setAttendances(List<Attendance> attendances) {
        this.attendances = attendances;
    }

    public List<Appraise> getAppraises() {
        return appraises;
    }

    public void setAppraises(List<Appraise> appraises) {
        this.appraises = appraises;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getContractExpireDate() {
        return contractExpireDate;
    }

    public void setContractExpireDate(Date contractExpireDate) {
        this.contractExpireDate = contractExpireDate;
    }

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }

    public PoliticStatus getPoliticStatus() {
        return politicStatus;
    }

    public void setPoliticStatus(PoliticStatus politicStatus) {
        this.politicStatus = politicStatus;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public WorkingStatus getWorkingStatus() {
        return workingStatus;
    }

    public void setWorkingStatus(WorkingStatus workingStatus) {
        this.workingStatus = workingStatus;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public List<Salary> getSalaries() {
        return Salaries;
    }

    public void setSalaries(List<Salary> salaries) {
        Salaries = salaries;
    }
}
