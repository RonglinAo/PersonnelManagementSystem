package org.PersonnelManagementSystem.bean;

import java.io.Serializable;

/**
 * @program: PersonnelManagementSystem
 * @description: Employee bean
 * @author: Ronglin.A
 * @create: 2019-10-18 17:14
 */
public class Employee implements Serializable {
    private String id;
    private String nationName;
    private String politicStatusName;
    private String degree;
    private String workingStatusName;
    private String department;
    private String job;
    private String jobTitle;
    private String educationMajor;
    private String educationSchool;
    private String employeeID;
    private String lastName;
    private String firstName;
    private String gender;
    private String birthday;
    private String idNumber;
    private String phone;
    private String email;
    private String address;
    private String entryTime;
    private String contractExpireDate;

    public Employee() {

    }

    public Employee(String id, String nationName, String politicStatusName, String degree, String workingStatusName,
                    String department, String job, String jobTitle, String educationMajor, String educationSchool,
                    String employeeID, String lastName, String firstName, String gender, String birthday,
                    String idNumber, String phone, String email, String address, String entryTime,
                    String contractExpireDate) {
        this.id = id;
        this.nationName = nationName;
        this.politicStatusName = politicStatusName;
        this.degree = degree;
        this.workingStatusName = workingStatusName;
        this.department = department;
        this.job = job;
        this.jobTitle = jobTitle;
        this.educationMajor = educationMajor;
        this.educationSchool = educationSchool;
        this.employeeID = employeeID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.birthday = birthday;
        this.idNumber = idNumber;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.entryTime = entryTime;
        this.contractExpireDate = contractExpireDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNationName() {
        return nationName;
    }

    public void setNationName(String nationName) {
        this.nationName = nationName;
    }

    public String getPoliticStatusName() {
        return politicStatusName;
    }

    public void setPoliticStatusName(String politicStatusName) {
        this.politicStatusName = politicStatusName;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getWorkingStatusName() {
        return workingStatusName;
    }

    public void setWorkingStatusName(String workingStatusName) {
        this.workingStatusName = workingStatusName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEducationMajor() {
        return educationMajor;
    }

    public void setEducationMajor(String educationMajor) {
        this.educationMajor = educationMajor;
    }

    public String getEducationSchool() {
        return educationSchool;
    }

    public void setEducationSchool(String educationSchool) {
        this.educationSchool = educationSchool;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
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

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public String getContractExpireDate() {
        return contractExpireDate;
    }

    public void setContractExpireDate(String contractExpireDate) {
        this.contractExpireDate = contractExpireDate;
    }
}
