package tech.reliab.course.toropchinda.bank.entity;

import java.time.LocalDate;

public class Employee extends BaseEntity<Long> {
    private static long idCount = 0;

    public Employee(String surname, String name, String patronymic, LocalDate dateBirth, String post, Bank bank, boolean isRemoteEmployee, BankOffice bankOffice, boolean canIssueCredit, int salary) {
        super(idCount++);
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
    private boolean canIssueCredit;
    private int salary;
    private BankOffice bankOffice;

    public static long getIdCount() {
        return idCount;
    }

    public static void setIdCount(long idCount) {
        Employee.idCount = idCount;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public boolean isRemoteEmployee() {
        return isRemoteEmployee;
    }

    public void setRemoteEmployee(boolean remoteEmployee) {
        isRemoteEmployee = remoteEmployee;
    }

    public BankOffice getBankOffice() {
        return bankOffice;
    }

    public void setBankOffice(BankOffice bankOffice) {
        this.bankOffice = bankOffice;
    }

    public boolean isCanIssueCredit() {
        return canIssueCredit;
    }

    public void setCanIssueCredit(boolean canIssueCredit) {
        this.canIssueCredit = canIssueCredit;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return STR
                . """
                EMPLOYEE: {
                employee id = \{ getId() }
                surname = \{ surname }
                name = \{ name }
                patronymic = \{ patronymic }
                birth day = \{ dateBirth }
                post = \{ post }
                bank = \n\t\{ bank.toString() }
                is remote worker = \{ isRemoteEmployee ? "yes" : "no" }
                can issue credit = \{ canIssueCredit ? "yes" : "no" }
                salary = \{ salary }
                bank office = \n\t\{ bankOffice.toString() }
                }
                """ ;
    }
}
