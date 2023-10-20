package tech.reliab.course.toropchinda.bank.service.imp;

import tech.reliab.course.toropchinda.bank.entity.Bank;
import tech.reliab.course.toropchinda.bank.entity.EntityHolder;
import tech.reliab.course.toropchinda.bank.entity.PaymentAccount;
import tech.reliab.course.toropchinda.bank.entity.User;
import tech.reliab.course.toropchinda.bank.service.PaymentAccountService;

public class PaymentAccountServiceImpl implements PaymentAccountService {

    private final EntityHolder entityHolder;

    public PaymentAccountServiceImpl(EntityHolder entityHolder) {
        this.entityHolder = entityHolder;
    }

    @Override
    public PaymentAccount getEntity() {
        return entityHolder.getPaymentAccount();
    }

    @Override
    public void updateEntity(PaymentAccount paymentAccount) {
        entityHolder.setPaymentAccount(paymentAccount);
    }

    @Override
    public void deleteEntity() {
        entityHolder.setPaymentAccount(null);
    }

    @Override
    public PaymentAccount createPaymentAccount(User user, Bank bank, int moneyAmount) {
        var paymentAccount = new PaymentAccount(user, bank, moneyAmount);
        user.setPaymentAccount(paymentAccount);
        entityHolder.setPaymentAccount(paymentAccount);
        return paymentAccount;
    }
}
