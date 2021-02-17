package com.preisler.eksamen.model;

import javax.persistence.*;

@Entity
public class Intern {

    public Intern(){

    }

    public Intern(Long internId,String firstName,String lastName,boolean isInternshipDone,String assignedCompany,Company company){
        this.internId = internId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isInternshipDone = isInternshipDone;
        this.assignedCompany = assignedCompany;
        this.company = company;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long internId;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private boolean isInternshipDone;

    @Column
    private String assignedCompany;

    @ManyToOne
    @JoinColumn(name = "companyId")
    private Company company;

    public Company getCompany() {
        return company;
    }


    public Long getInternId() {
        return internId;
    }

    public void setInternId(Long internId) {
        this.internId = internId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isInternshipDone() {
        return isInternshipDone;
    }

    public void setInternshipDone(boolean internshipDone) {
        isInternshipDone = internshipDone;
    }

    public String getAssignedCompany() {
        return assignedCompany;
    }

    public void setAssignedCompany(String assignedCompany) {
        this.assignedCompany = assignedCompany;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
