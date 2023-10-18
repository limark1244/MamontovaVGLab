package tech.reliab.course.toropchinda.bank.entity;

import java.time.LocalDate;

public class User extends BaseEntity<Long> {
    public User(Long id, String surname, String name, String patronymic, LocalDate dateBirth, String workPlace, Bank bank) {
        super(id);
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

}
