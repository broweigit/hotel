package server.service;

import server.domain.Account;

import java.util.List;

public interface UserRegService {
    public Account addAccount(Account account);
    public void updateAccount(Account account);
    public void deleteAccount(Integer id);
    public Account getAccount(Integer id);
    public List<Account> getAll();
}
