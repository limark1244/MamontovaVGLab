package tech.reliab.course.toropchinda.bank.service;

import tech.reliab.course.toropchinda.bank.entity.*;

import java.time.LocalDate;

public interface CreditAccountService extends BaseService<CreditAccount> {

    CreditAccount createCreditAccount(Long id, User user, Bank bank, LocalDate creditStartDate, LocalDate creditEndDate, int creditMonthCount, int creditAmount, int monthPayment, Employee employee, PaymentAccountService paymentAccountService);
}
