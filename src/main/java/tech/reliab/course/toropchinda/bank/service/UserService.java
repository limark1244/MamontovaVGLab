package tech.reliab.course.toropchinda.bank.service;

import tech.reliab.course.toropchinda.bank.entity.Bank;
import tech.reliab.course.toropchinda.bank.entity.User;

import java.time.LocalDate;

public interface UserService extends BaseService<User> {

    User createUser(Long id, String surname, String name, String patronymic, LocalDate dateBirth, String workPlace, Bank bank);
}
