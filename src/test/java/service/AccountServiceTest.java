package service;

import domains.account.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountServiceTest {

    static AccountService accountService = new AccountService();
    static Account account = new Account();

    @Test
    void generateAccount() {
        assertNotNull(accountService.generateAccount("alireza", "123"));
    }

    @Test
    void accountLogIn() {
        assertNotNull(accountService.accountLogIn("alireza", "123"));
    }

    @Test
    void getAccount() {
        assertNotNull(accountService.getAccount("alireza"));
    }


    @Test
    void changePassword() {
        account = accountService.getAccount("alireza");
        accountService.changePassword(account, "1234");
        assertEquals("1234", account.getPassword());
    }

    @Test
    void changeUsername() {
        account = accountService.getAccount("alireza");
        accountService.changeUsername(account, "peyman");
        assertEquals("peyman", account.getUsername());
    }


    @Test
    void deleteAccount() {
        assertNull(accountService.accountLogIn("alireza", "123"));
    }
}