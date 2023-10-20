package tech.reliab.course.toropchinda.bank.entity;

import java.time.LocalDate;

public class User extends BaseEntity<Long> {

    private static long idCount = 0;

    public User(String surname, String name, String patronymic, LocalDate dateBirth, String workPlace, Bank bank) {
        super(idCount++);
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateBirth = dateBirth;
        this.workPlace = workPlace;
        this.monthIncome = (int) (Math.random() * 10_000);
        this.bank = bank;
        this.creditRate = calcCreditRate();
        bank.upraiseClientCount();
    }

    private int calcCreditRate() {
        if (monthIncome < 1000) {
            return 100;
        }
        return monthIncome / 10;
    }

    private String surname;
    private String name;
    private String patronymic;
    private LocalDate dateBirth;
    private String workPlace;
    private int monthIncome;
    private Bank bank;
    private CreditAccount creditAccount;
    private PaymentAccount paymentAccount;
    private int creditRate;

    public static long getIdCount() {
        return idCount;
    }

    public static void setIdCount(long idCount) {
        User.idCount = idCount;
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

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public int getMonthIncome() {
        return monthIncome;
    }

    public void setMonthIncome(int monthIncome) {
        this.monthIncome = monthIncome;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public CreditAccount getCreditAccount() {
        return creditAccount;
    }

    public void setCreditAccount(CreditAccount creditAccount) {
        this.creditAccount = creditAccount;
    }

    public PaymentAccount getPaymentAccount() {
        return paymentAccount;
    }

    public void setPaymentAccount(PaymentAccount paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    public int getCreditRate() {
        return creditRate;
    }

    public void setCreditRate(int creditRate) {
        this.creditRate = creditRate;
    }

    @Override
    public String toString() {
        return STR
                . """
                USER: {
                user id = \{ getId() }
                surname = \{ surname }
                name = \{ name }
                patronymic = \{ patronymic }
                birth date = \{ dateBirth }
                work place = \{ workPlace }
                month income = \{ monthIncome }
                bank = \n\t\{ bank.toString() }
                credit account = \n\t\{ creditAccount.toString() }
                payment account = \n\t\{ paymentAccount.toString() }
                credit rate = \{ creditRate }
                }
                """ ;
    }
}
