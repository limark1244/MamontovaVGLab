package tech.reliab.course.toropchinda.bank.service;

import tech.reliab.course.toropchinda.bank.entity.Bank;
import tech.reliab.course.toropchinda.bank.entity.PaymentAccount;
import tech.reliab.course.toropchinda.bank.entity.User;

public interface PaymentAccountService extends BaseService<PaymentAccount> {

    PaymentAccount createPaymentAccount(Long id, User user, Bank bank, int moneyAmount);
}
