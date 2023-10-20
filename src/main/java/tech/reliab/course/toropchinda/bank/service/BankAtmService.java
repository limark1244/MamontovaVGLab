package tech.reliab.course.toropchinda.bank.service;

import tech.reliab.course.toropchinda.bank.entity.Bank;
import tech.reliab.course.toropchinda.bank.entity.BankAtm;
import tech.reliab.course.toropchinda.bank.entity.BankOffice;
import tech.reliab.course.toropchinda.bank.entity.Employee;
import tech.reliab.course.toropchinda.bank.entity.enums.StatusEnum;

public interface BankAtmService extends BaseService<BankAtm> {

    BankAtm createBankAtm(String name, BankOffice office, StatusEnum status, Bank bank, Employee employee, boolean withdrawMoney, boolean depositMoney, int atmServingCost);
}
