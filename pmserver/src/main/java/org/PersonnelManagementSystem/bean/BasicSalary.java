package org.PersonnelManagementSystem.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: PersonnelManagementSystem
 * @description: Basic salary bean
 * @author: Ronglin.A
 * @create: 2019-10-26 13:02
 */
public class BasicSalary implements Serializable {
    private long id;
    private String name;
    private float basicSalary;
    private float mealSubsidy;
    private float trafficSubsidy;
    private float pension;
    private float accumulationFund;
    private float medicalInsurance;
    private float pensionRatio;
    private float accumulationFundRatio;
    private float medicalInsuranceRatio;
    private Date date;
    private boolean enabled;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getPension() {
        return pension;
    }

    public void setPension(float pension) {
        this.pension = pension;
    }

    public float getAccumulationFund() {
        return accumulationFund;
    }

    public void setAccumulationFund(float accumulationFund) {
        this.accumulationFund = accumulationFund;
    }

    public float getMedicalInsurance() {
        return medicalInsurance;
    }

    public void setMedicalInsurance(float medicalInsurance) {
        this.medicalInsurance = medicalInsurance;
    }

    public float getAccumulationFundRatio() {
        return accumulationFundRatio;
    }

    public void setAccumulationFundRatio(float accumulationFundRatio) {
        this.accumulationFundRatio = accumulationFundRatio;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public float getMealSubsidy() {
        return mealSubsidy;
    }

    public void setMealSubsidy(float mealSubsidy) {
        this.mealSubsidy = mealSubsidy;
    }

    public float getTrafficSubsidy() {
        return trafficSubsidy;
    }

    public void setTrafficSubsidy(float trafficSubsidy) {
        this.trafficSubsidy = trafficSubsidy;
    }

    public float getPensionRatio() {
        return pensionRatio;
    }

    public void setPensionRatio(float pensionRatio) {
        this.pensionRatio = pensionRatio;
    }


    public float getMedicalInsuranceRatio() {
        return medicalInsuranceRatio;
    }

    public void setMedicalInsuranceRatio(float medicalInsuranceRatio) {
        this.medicalInsuranceRatio = medicalInsuranceRatio;
    }
}
