package tech.reliab.course.toropchinda.bank.entity;

public class PaymentAccount extends BaseEntity<Long> {
    private static long idCount = 0;

    public PaymentAccount(User user, Bank bank, int moneyAmount) {
        super(idCount++);
        this.user = user;
        this.bankName = bank.getName();
        this.moneyAmount = moneyAmount;
    }

    private User user;
    private String bankName;
    private int moneyAmount;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    @Override
    public String toString() {
        return STR
                . """
                PAYMENT_ACCOUNT: {
                payment account id = \{ getId() }
                bank name = \{ bankName }
                money amount = \{ moneyAmount }
                }
                """ ;
    }
}
