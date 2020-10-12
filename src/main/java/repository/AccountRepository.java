package repository;

import domains.account.Account;


public interface AccountRepository<ID> {
    Account generateAccount(Account account);
    Account getFollowers(ID id);
    Account getFollwings(ID id);
}
