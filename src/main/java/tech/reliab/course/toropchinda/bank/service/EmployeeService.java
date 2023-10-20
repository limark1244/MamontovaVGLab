package tech.reliab.course.toropchinda.bank.service;

import tech.reliab.course.toropchinda.bank.entity.Bank;
import tech.reliab.course.toropchinda.bank.entity.BankOffice;
import tech.reliab.course.toropchinda.bank.entity.Employee;

import java.time.LocalDate;

public interface EmployeeService extends BaseService<Employee> {

    Employee createEmployee(String surname, String name, String patronymic, LocalDate dateBirth, String post, Bank bank, boolean isRemoteEmployee, BankOffice bankOffice, boolean canIssueCredit, int salary);

}
