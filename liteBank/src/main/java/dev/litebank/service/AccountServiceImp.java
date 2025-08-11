package dev.litebank.service;

import dev.litebank.dto.DepositRequest;
import dev.litebank.dto.DepositResponse;
import dev.litebank.model.Account;
import dev.litebank.repository.AccountRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountServiceImp implements AccountService {

    private final AccountRepository accountRepository;



    @Override
    public DepositResponse deposit(DepositRequest depositRequest) {
        Optional<Account> foundAccount = accountRepository.findByAccountNumber(depositRequest.getAccountNumber());
        return null;

    }
}
