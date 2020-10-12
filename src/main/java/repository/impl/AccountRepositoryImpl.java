package repository.impl;

import domains.account.Account;
import domains.user.User;
import repository.AccountRepository;
import repository.base.BaseRepository;

public class AccountRepositoryImpl extends BaseRepository<Account, Long> implements AccountRepository<Long> {
    private static AccountRepositoryImpl accountRepository = new AccountRepositoryImpl();

    public static AccountRepositoryImpl getInstance() {
        if (accountRepository == null) return accountRepository = new AccountRepositoryImpl();
        return accountRepository;
    }

    @Override
    public Account generateAccount(Account account) {
        return save(account);
    }


    @Override
    public Account getFollowers(Long id) {
        accountRepository.load(id);
        return null;
    }


    @Override
    public Account getFollwings(Long id) {
        return null;
    }

    @Override
    protected Class<Account> getEntityClass() {
        return Account.class;
    }
}
