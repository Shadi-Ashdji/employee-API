package com.shadi.employeeapi;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


@Entity 
public class Employee {

	   @Id
	    private Integer empID;

	    @NotBlank(message = "First name is required")
	    private String firstName;

	    @NotBlank(message = "Last name is required")
	    private String lastName;

	    @Email(message = "Invalid email format")
	    @NotBlank(message = "Email is required")
	    private String email;

	    @NotBlank(message = "Department is required")
	    private String department;

	    @NotNull(message = "Remote status must be provided")
	    private Boolean isRemote;

    public Employee() {
    }

    public Employee(Integer empID, String firstName, String lastName, String email, String department, Boolean isRemote) {
        this.empID = empID;
        this.firstName = firstName;
        this.lastName = lastName;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fName) {
        this.firstName = fName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lName) {
        this.lastName = lName;
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

