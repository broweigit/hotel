package server.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;
import server.domain.Account;

import java.util.List;

public interface UserRegDao {

    @Select("INSERT INTO accounts (username, password) VALUES (#{userName}, #{password}) RETURNING id")
    public Integer addAccount(Account account);

    @Update("UPDATE accounts SET username=#{userName},password=#{password} WHERE id=#{id}")
    public boolean updateAccount(Account account);

    @Delete("DELETE FROM accounts where id=#{id}")
    public boolean deleteAccount(Integer id);

    @Select("SELECT * FROM accounts where id=#{id}")
    public Account getAccount(Integer id);

    @Select("SELECT * FROM accounts")
    List<Account> getAll();
}
