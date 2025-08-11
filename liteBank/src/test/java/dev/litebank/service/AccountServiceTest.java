package dev.litebank.service;

import dev.litebank.dto.DepositRequest;
import dev.litebank.dto.DepositResponse;
import dev.litebank.dto.PaymentMethod;
import dev.litebank.dto.TransactionStatus;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class AccountServiceTest {
    @Autowired
    private AccountService accountService;

    @Test
    void testCanDeposit(){
        DepositRequest depositRequest = new DepositRequest();
        depositRequest.setPaymentMethod(PaymentMethod.CARD);
        depositRequest.setAccountNumber("0987654321");
        depositRequest.setAmount(new BigDecimal(10_00));

        DepositResponse depositResponse = accountService.deposit(depositRequest);
        assertNotNull(depositResponse);
        assertEquals(TransactionStatus.SUCCESS,depositResponse.getTransactionStatus());
    }

}
