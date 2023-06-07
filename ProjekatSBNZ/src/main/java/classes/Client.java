package classes;

import java.util.Date;
import java.util.List;

public class Client {

    private String name;
    private String surname;

    private Integer age;
    private Integer id;
    // Ostale informacije koje su nam potrebe ce se pribavljati iz klienta, i treba ih dodati u klient klasu, a to su:
    // primanja, zaposlenje, krediti, rizicna grupa, prioritet

    private Integer income;
    //canCoverExistingLoanRepayments
    //canCoverLoanRepayment
    //hasStableIncome
    private String job_security;
    private Integer priority;
    private String riskCategory;


    public Client(){};

    public Client(String name, String surname, Integer age, Integer id, Integer income) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
        this.income = income;
        this.priority = 0;
        if (age > 60){
            this.riskCategory = "high";
        }
        else
        {this.riskCategory = "low";}

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getRiskCategory() {
        return riskCategory;
    }

    public void setRiskCategory(String riskCategory) {
        this.riskCategory = riskCategory;
    }

    public String getJob_security() {
        return job_security;
    }

    public void setJob_security(String job_security) {
        this.job_security = job_security;
    }
}
