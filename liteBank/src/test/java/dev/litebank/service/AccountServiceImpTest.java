package dev.litebank.service;

import dev.litebank.model.Account;
import dev.litebank.repository.AccountRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest

class AccountServiceImpTest {

    @Autowired
    private AccountRepository accountRepository;

    @Test
    @Sql(scripts = {"/db/data.sql"})
    void findByAccountNumber() {
        Optional<Account> account = accountRepository.findByAccountNumber("09887644");
        Account customerAccount = account.orElseThrow(RuntimeException::new);
        assertNotNull(customerAccount);
    }

}