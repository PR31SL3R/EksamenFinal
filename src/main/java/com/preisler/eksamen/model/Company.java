package com.preisler.eksamen.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Company {

    public Company(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyId;

    @Column
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "company") // evt. .DETACH
    private Set<Intern> interns;  // TODO: check om Hibernate kan garantere et objekt her

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Intern> getInterns() {
        return interns;
    }

    public void setInterns(Set<Intern> interns) {
        this.interns = interns;
    }
}



