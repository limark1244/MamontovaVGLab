package tech.reliab.course.toropchinda.bank.service;

import tech.reliab.course.toropchinda.bank.entity.*;

public interface BankAtmService extends BaseService<BankAtm> {

    BankAtm createBankAtm(Long id, String name, BankOffice office, StatusEnum status, Bank bank, Employee employee, boolean withdrawMoney, boolean depositMoney, int atmServingCost);
}
