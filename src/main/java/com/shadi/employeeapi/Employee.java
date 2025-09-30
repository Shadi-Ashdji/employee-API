package com.shadi.employeeapi;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity 
public class Employee {

    @Id
    private Integer empID; // Primary Key
    
    private String fName;
    private String lName;
    private String email;
    private String department;
    private Boolean isRemote;

    public Employee() {
    }

    public Employee(Integer empID, String fName, String lName, String email, String department, Boolean isRemote) {
        this.empID = empID;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.department = department;
        this.isRemote = isRemote;
    }

    public Integer getEmpID() {
        return empID;
    }
    
    public void setEmpID(Integer empID) {
        this.empID = empID;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Boolean getIsRemote() {
        return isRemote;
    }
    
    public void setIsRemote(Boolean isRemote) {
        this.isRemote = isRemote;
    }

} 

