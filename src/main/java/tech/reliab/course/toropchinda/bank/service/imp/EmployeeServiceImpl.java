package tech.reliab.course.toropchinda.bank.service.imp;

import tech.reliab.course.toropchinda.bank.entity.Bank;
import tech.reliab.course.toropchinda.bank.entity.BankOffice;
import tech.reliab.course.toropchinda.bank.entity.Employee;
import tech.reliab.course.toropchinda.bank.entity.EntityHolder;
import tech.reliab.course.toropchinda.bank.service.EmployeeService;

import java.time.LocalDate;

public class EmployeeServiceImpl implements EmployeeService {
    private final EntityHolder entityHolder;

    public EmployeeServiceImpl(EntityHolder entityHolder) {
        this.entityHolder = entityHolder;
    }

    @Override
    public Employee getEntity() {
        return entityHolder.getEmployee();
    }

    @Override
    public void updateEntity(Employee employee) {
        entityHolder.setEmployee(employee);
    }

    @Override
    public void deleteEntity() {
        entityHolder.setEmployee(null);
    }

    @Override
    public Employee createEmployee(String surname, String name, String patronymic, LocalDate dateBirth, String post, Bank bank, boolean isRemoteEmployee, BankOffice bankOffice, boolean canIssueCredit, int salary) {
        var employee = new Employee(surname, name, patronymic, dateBirth, post, bank, isRemoteEmployee, bankOffice, canIssueCredit, salary);
        entityHolder.setEmployee(employee);
        return employee;
    }
}
