package repository.impl;

import domains.account.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AccountRepositoryImplTest {
    static  AccountRepositoryImpl accountRepository = AccountRepositoryImpl.getInstance();

    @Test
    void accountLogIn() {

        assertNotNull( accountRepository.accountLogIn("pirooz193", "123"));
    }

    @Test
    void getAccountByUsername() {
        assertNotNull(accountRepository.getAccountByUsername("pirooz193"));
    }

    @Test
    void generateAccount() {
        Account account = new Account();
        account.setUsername("reza");
        account.setPassword("147");
        assertNotNull(accountRepository.generateAccount(account));
    }
}