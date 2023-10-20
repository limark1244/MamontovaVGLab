package tech.reliab.course.toropchinda.bank.service.imp;

import tech.reliab.course.toropchinda.bank.entity.Bank;
import tech.reliab.course.toropchinda.bank.entity.CreditAccount;
import tech.reliab.course.toropchinda.bank.entity.Employee;
import tech.reliab.course.toropchinda.bank.entity.EntityHolder;
import tech.reliab.course.toropchinda.bank.entity.PaymentAccount;
import tech.reliab.course.toropchinda.bank.entity.User;
import tech.reliab.course.toropchinda.bank.service.CreditAccountService;

import java.time.LocalDate;

public class CreditAccountServiceImpl implements CreditAccountService {

    private final EntityHolder entityHolder;

    public CreditAccountServiceImpl(EntityHolder entityHolder) {
        this.entityHolder = entityHolder;
    }

    @Override
    public CreditAccount getEntity() {
        return entityHolder.getCreditAccount();
    }

    @Override
    public void updateEntity(CreditAccount creditAccount) {
        entityHolder.setCreditAccount(creditAccount);
    }

    @Override
    public void deleteEntity() {
        entityHolder.setCreditAccount(null);
    }


    @Override
    public CreditAccount createCreditAccount(User user, Bank bank, LocalDate creditStartDate, LocalDate creditEndDate,
                                             int creditMonthCount, double creditAmount, Employee employee, PaymentAccount paymentAccount) {
        CreditAccount creditAccount = new CreditAccount(user, bank, creditStartDate, creditEndDate, creditMonthCount,
                creditAmount, employee, paymentAccount);
        user.setCreditAccount(creditAccount);
        entityHolder.setCreditAccount(creditAccount);
        return creditAccount;
    }
}
