package server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.dao.UserRegDao;
import server.domain.Account;
import server.service.UserRegService;

import java.util.List;

@Service
public class UserRegServiceImpl implements UserRegService {

    @Autowired
    private UserRegDao userRegDao;

    // return account with id
    public Account addAccount(Account account) {
        account.setId(userRegDao.addAccount(account));
        return account;
    }
    public void updateAccount(Account account) {
        userRegDao.updateAccount(account);
    }
    public void deleteAccount(Integer id) {
        userRegDao.deleteAccount(id);
    }
    public Account getAccount(Integer id) {
        return userRegDao.getAccount(id);
    }
    public List<Account> getAll() {
        return userRegDao.getAll();
    }

    public void setUserRegDao(UserRegDao userRegDao) {
        this.userRegDao = userRegDao;
    }
}
