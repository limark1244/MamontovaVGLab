package tech.reliab.course.toropchinda.bank.service;

import tech.reliab.course.toropchinda.bank.entity.Bank;
import tech.reliab.course.toropchinda.bank.entity.CreditAccount;
import tech.reliab.course.toropchinda.bank.entity.Employee;
import tech.reliab.course.toropchinda.bank.entity.PaymentAccount;
import tech.reliab.course.toropchinda.bank.entity.User;

import java.time.LocalDate;

public interface CreditAccountService extends BaseService<CreditAccount> {

    CreditAccount createCreditAccount(User user, Bank bank, LocalDate creditStartDate, LocalDate creditEndDate,
                                      int creditMonthCount, double creditAmount, Employee employee, PaymentAccount paymentAccount);
}
