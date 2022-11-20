package server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import server.domain.Account;
import server.service.UserRegService;

import java.util.List;

@RestController
@RequestMapping("/register/accounts")
public class UserRegController {
    @Autowired
    private UserRegService userRegService;

    @PostMapping
    public Account addAccountServlet(Account account){
        account = userRegService.addAccount(account);
        return account;
    }

    @DeleteMapping(value = "/{id}")
    public String deleteAccountServlet(@PathVariable Integer id){
        userRegService.deleteAccount(id);
        return "deleted";
    }

    @PutMapping
    public String updateAccountServlet(@RequestBody Account account){
        userRegService.updateAccount(account);
        System.out.println(account);
        return "updated";
    }

    @GetMapping(value = "/{id}")
    public Account getAccountServlet(@PathVariable Integer id){
        return userRegService.getAccount(id);
    }

    @GetMapping
    public List<Account> getAllServlet(){
        return userRegService.getAll();
    }
}
