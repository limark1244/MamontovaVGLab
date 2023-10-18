package tech.reliab.course.toropchinda.bank.entity;

import java.time.LocalDate;

public class Employee extends BaseEntity<Long> {

    public Employee(Long id, String surname, String name, String patronymic, LocalDate dateBirth, String post, Bank bank, boolean isRemoteEmployee, BankOffice bankOffice, boolean canIssueCredit, int salary) {
        super(id);
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateBirth = dateBirth;
        this.post = post;
        this.bank = bank;
        this.isRemoteEmployee = isRemoteEmployee;
        this.bankOffice = bankOffice;
        this.canIssueCredit = canIssueCredit;
        this.salary = salary;
        bank.upraiseEmployeeCount();
    }

    private String surname;
    private String name;
    private String patronymic;
    private LocalDate dateBirth;
    private String post;
    private Bank bank;
    private boolean isRemoteEmployee;
    private BankOffice bankOffice;
    private boolean canIssueCredit;
    private int salary;

}
