package tech.reliab.course.toropchinda.bank.entity;

import java.time.LocalDate;

public class CreditAccount extends BaseEntity<Long> {

    public CreditAccount(Long id, User user, Bank bank, LocalDate creditStartDate, LocalDate creditEndDate, int creditMonthCount, int creditAmount, int monthPayment,Employee employee, PaymentAccount paymentAccount) {
        super(id);
        this.user = user;
        this.bankName = bank.getName();
        this.creditStartDate = creditStartDate;
        this.creditEndDate = creditEndDate;
        this.creditMonthCount = creditMonthCount;
        this.creditAmount = creditAmount;
        this.monthPayment = monthPayment;
        this.interestRate = bank.getInterestRate();
        this.employee = employee;
        this.paymentAccount = paymentAccount;
    }
    private User user;
    private String bankName;
    private LocalDate creditStartDate;
    private LocalDate creditEndDate;
    private int creditMonthCount;
    private int creditAmount;
    private int monthPayment;
    private double interestRate;
    private Employee employee;
    private PaymentAccount paymentAccount;


}
