package tech.reliab.course.toropchinda.bank.entity;

import tech.reliab.course.toropchinda.bank.entity.enums.EntityNameEnum;

public class EntityHolder {

    private static final String NULL_MESSAGE = "Entity does not exist";
    private Bank bank;
    private BankAtm bankAtm;
    private User user;
    private Employee employee;
    private PaymentAccount paymentAccount;
    private CreditAccount creditAccount;
    private BankOffice bankOffice;
    private static final String MESSAGE_FOR_EMPTY_ENTITY = "Can't find bank :(";

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public BankAtm getBankAtm() {
        return bankAtm;
    }

    public void setBankAtm(BankAtm bankAtm) {
        this.bankAtm = bankAtm;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public PaymentAccount getPaymentAccount() {
        return paymentAccount;
    }

    public void setPaymentAccount(PaymentAccount paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    public CreditAccount getCreditAccount() {
        return creditAccount;
    }

    public void setCreditAccount(CreditAccount creditAccount) {
        this.creditAccount = creditAccount;
    }

    public BankOffice getBankOffice() {
        return bankOffice;
    }

    public void setBankOffice(BankOffice bankOffice) {
        this.bankOffice = bankOffice;
    }

    public void printEntityInfo(EntityNameEnum nameEnum) {
        var message = switch (nameEnum) {
            case BANK -> toStringForObject(bank);
            case BANK_ATM -> toStringForObject(bankAtm);
            case BANK_OFFICE -> toStringForObject(bankOffice);
            case CREDIT_ACCOUNT -> toStringForObject(creditAccount);
            case EMPLOYEE -> toStringForObject(employee);
            case PAYMENT_ACCOUNT -> toStringForObject(paymentAccount);
            case USER -> toStringForObject(user);
            case null -> NULL_MESSAGE;
        };
        System.out.println(message);
    }

    private String toStringForObject(Object entityObject) {
        return entityObject == null ? MESSAGE_FOR_EMPTY_ENTITY : entityObject.toString();
    }
}
