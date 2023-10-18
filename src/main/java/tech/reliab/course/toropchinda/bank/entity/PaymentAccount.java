package tech.reliab.course.toropchinda.bank.entity;

public class PaymentAccount extends BaseEntity<Long> {
    public PaymentAccount(Long id, User user, Bank bank, int moneyAmount) {
        super(id);
        this.user = user;
        this.bankName = bank.getName();
        this.moneyAmount = moneyAmount;
    }

    private User user;
    private String bankName;
    private int moneyAmount;

}
